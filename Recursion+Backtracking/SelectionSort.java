public class SelectionSort {

    static void sort(int[] arr, int index) {

        // Base case
        if (index == arr.length - 1) {
            return;
        }

        // Find minimum element index
        //Repeatedly select the minimum element from the unsorted part
        //Swap it with the first unsorted position

        int minIndex = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap
        int temp = arr[index];
        arr[index] = arr[minIndex];
        arr[minIndex] = temp;

        // Recursive call
        sort(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        sort(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
