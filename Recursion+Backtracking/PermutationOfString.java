public class PermutationOfString {

    static void solve(char[] arr, int index) {

        // Base case
        if (index == arr.length) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Swap
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            // Rc
            solve(arr, index + 1);

            // Backtrack
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        String str = "abc";
        char[] arr = str.toCharArray();

        solve(arr, 0);
    }
}
