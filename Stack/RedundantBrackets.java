import java.util.Stack;

public class RedundantBrackets {

    static boolean hasRedundantBrackets(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // push opening bracket or operator
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            }
            // closing bracket
            else if (ch == ')') {

                boolean hasOperator = false;

                // pop till '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();

                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }

                // pop '('
                stack.pop();

                if (!hasOperator) {
                    return true; // redundant found
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String expr = "((a+b))";

        System.out.println(hasRedundantBrackets(expr)); 
    }
    
}
