public class ReverseArayByKplace {

    public static void rotateSimple(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

            for (int i = 0; i < n; i++) {
                temp[(i + k) % n] = arr[i];
            }

        // Copy back
        for (int i = 0; i < n; i++) {
             arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateSimple(arr, k);

        System.out.print("Rotated Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
