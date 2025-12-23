import java.util.Stack;

public class ReverseString {

    public static String reverse(String s){

        Stack<Character> stack=new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            stack.push(s.charAt(i));
        }

        StringBuilder result=new StringBuilder();

        for( int i=0; i<s.length() ;i++){
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        String s = "tanvi";
        String reversed = reverse(s);

        System.out.println("Reversed string: " + reversed);
    }
    
}
