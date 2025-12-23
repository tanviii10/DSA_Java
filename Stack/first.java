import java.util.Stack;
public class first{

    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<>();

        s.push(2);
        s.push(4);
        s.push(34);

        System.out.println("top elememt :"+ s.peek());

        s.pop();
        s.pop();

        System.out.println("top of stack:"+ s.peek());

        System.out.println("is empty :"+ s.isEmpty());

        System.out.println("size of stack:"+ s.size());
    }

}