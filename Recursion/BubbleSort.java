public class BubbleSort {

    public static void sort(int[] arr, int n) {

        // Base case
        if (n == 1) {
            return;
        }

        // One pass of bubble sort
        //After 1 pass, the largest element moves to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call with reduced size
        sort(arr, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 7, 10, 3, 1};

        sort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
