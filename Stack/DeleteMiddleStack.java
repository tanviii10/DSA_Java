import java.util.Stack;

public class DeleteMiddleStack {

    static void deleteMiddle( Stack<Integer> stack, int count, int mid){

        //base case 
        if( count == mid){
            stack.pop();
            return;
        }

        int temp=stack.pop();

        //recusion
        deleteMiddle(stack, count+1, mid);

        //push back elememt
        stack.push(temp);
    }

    static void removeMiddle( Stack<Integer> stack){

        int n=stack.size();
        int mid= n/2;

        deleteMiddle(stack, 0, mid);
    }

    public static void main(String[] args) {
        
        Stack <Integer> stack=new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        removeMiddle(stack);

        System.out.println(stack);
    }
    
}
