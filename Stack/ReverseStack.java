import java.util.Stack;

public class ReverseStack {

    static void insertBottom(Stack<Integer> stack, int elememt){

        if( stack.isEmpty()){
            stack.push(elememt);
            return;
        }

        int temp=stack.pop();

        insertBottom(stack, elememt);

        stack.push(temp);
    }

    static void reverse( Stack<Integer> stack){
        
        if( stack.isEmpty()){
            return;
        }

        int temp=stack.pop();

        reverse(stack);

        insertBottom(stack,temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        
        reverse(stack);

        System.out.println(stack);
    }
}
