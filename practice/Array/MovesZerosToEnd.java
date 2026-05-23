public class MovesZerosToEnd {
    public static void moveZero(int arr[]){
        int j=0;
        for(int i=0 ; i < arr.length; i++){
            if( arr[i] != 0 ){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                j++;
            }
        }
    }
    public static void main(String main[]){
        int arr[]={0,10,20,0,0,30,40,0,50};

        moveZero(arr);
        for(int i=0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
