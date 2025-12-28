public class InsertionSort {

    static void sort(int[] arr, int n) {

        // Base case
        if (n <= 1) {
            return;
        }

        // Sort first n-1 elements
        sort(arr, n - 1);

        // Insert nth element into sorted part
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};

        sort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
