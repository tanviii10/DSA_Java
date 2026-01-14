public class CircularTour {

    static int circularTour(int[] petrol, int[] distance, int n) {

        int balance = 0;
        int deficit = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {

            balance += petrol[i] - distance[i];

            // if petrol becomes negative
            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }

        if (balance + deficit >= 0) {
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int n = petrol.length;

        System.out.println(circularTour(petrol, distance, n));
    }
    
}
