import java.util.Stack;

public class SortStack {

    static void insertSorted(Stack<Integer> stack, int x) {

        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, x);
        stack.push(temp);
    }

    // sort stack
    static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        sortStack(stack);
        insertSorted(stack, temp);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        System.out.println(stack);
    }
    
}
