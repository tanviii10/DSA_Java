public class InversionCount {

    static long mergeAndCount(int[] arr, int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[start + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = start;
        long count = 0;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                count += (n1 - i);  
            }
        }

        while (i < n1)
            arr[k++] = leftArr[i++];

        while (j < n2)
            arr[k++] = rightArr[j++];

        return count;
    }

    static long mergeSortAndCount(int[] arr, int start, int end) {

        if (start >= end)
            return 0;

        int mid = start + (end - start) / 2;

        long count = 0;

        count += mergeSortAndCount(arr, start, mid);
        count += mergeSortAndCount(arr, mid + 1, end);
        count += mergeAndCount(arr, start, mid, end);

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 2, 1};

        long inversions = mergeSortAndCount(arr, 0, arr.length - 1);

        System.out.println("Inversion Count = " + inversions);
    }
}
