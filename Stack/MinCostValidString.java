import java.util.Stack;

public class MinCostValidString {

    static int minCost(String s) {

        int n = s.length();

        // odd length
        if (n % 2 == 1) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                stack.push(ch);
            } 
            else {
                //for closing bracket jab opening braket melega tab pop karo
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        int open = 0, close = 0;

        while (!stack.isEmpty()) {
            if (stack.pop() == '{') {
                open++;
            } else {
                close++;
            }
        }

        return (open + 1) / 2 + (close + 1) / 2;
    }

    public static void main(String[] args) {

        String s = "}{{}}{{{";

        System.out.println(minCost(s)); 
    }
    
}
