public class SwapAlternates {

    public static void alternate(int arr[]){

        for(int i=0 ; i< arr.length ;i=i+2){

            if(i+1< arr.length){

                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
    }

    public static void main(String[] args) {
        
        int arr[]={ 2,6,7,6,4,3,90,67,2,1,56};

        alternate(arr);

        for(int i=0 ; i<arr.length ;i++){
            System.out.print( arr[i]+ " " );
        }
        
    }  
}
