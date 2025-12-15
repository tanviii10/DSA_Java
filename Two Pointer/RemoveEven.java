public class RemoveEven {

    public static int remove(int arr[]){

        int i=0;
        for(int j=0 ; j<arr.length ;j++){

            if(arr[j] % 2 != 0){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int len = remove(arr);

        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
