public class LeftRotatebyDplace {

    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    static void rotate(int arr[], int n, int d){

        if(d==0 || d==n ) return ;

        d=d % n;

        reverse(arr ,0, d-1);
        reverse(arr , d, n-1);
        reverse(arr , 0, n-1);

    }

    public static void main(String[] args) {
        int arr[]={4,3,1,5,6,7,84,3,};
        int n = arr.length;
        int d = 2;

        rotate(arr, n, d);

        System.out.println("Array after left rotation by " + d + " places:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
