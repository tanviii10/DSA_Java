public class IsSorted {

    public static boolean isSorted(int[] arr, int index) {

        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 6, 2};

        boolean ans = isSorted(arr, 0);

        if (ans) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
