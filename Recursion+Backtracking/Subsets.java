import java.util.ArrayList;

public class Subsets {

    static void solve(int[] arr, int index, ArrayList<Integer> output) {

        // Base case
        if (index == arr.length) {
            System.out.println(output);
            return;
        }

        // Exclude
        solve(arr, index + 1, output);

        // Include 
        output.add(arr[index]);
        solve(arr, index + 1, output);

        // Backtrack
        output.remove(output.size() - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        ArrayList<Integer> output = new ArrayList<>();

        solve(arr, 0, output);
    }
}
