public class MovesZerotoEnd {

    static void move(int arr[]){
        
        int j=-1;
        
        for( int i=0; i< arr.length ; i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }

        if( j == -1) return;

        for( int i=j+1; i< arr.length ; i++){
            if( arr[i] != 0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 4, 0, 5};

        move(arr);

        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
