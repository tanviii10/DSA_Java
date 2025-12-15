public class MoveAllZeroToEnd {

    public static void move(int arr[]){

        int i=0;
        
        for(int j=0; j<arr.length ; j++){

            if(arr[j] !=0 ){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
            }
        }
    }
    public static void main(String[] args) {

        int arr[]={0,0,5,0,6,3,9,0,5};

       move(arr);
       for( int num : arr){
            System.out.print(num +" ");
       }

    }
}
