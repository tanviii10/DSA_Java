public class PermutationOfArray {

    static void solve(int[] arr, int index) {

        // Base case
        if (index == arr.length) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Swap
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            // Recursive call
            solve(arr, index + 1);

            // Backtrack (swap back)
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        solve(arr, 0);
    }
}
