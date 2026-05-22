public class Sort01 {

    public static void sort(int arr[]){

        int i=0;
        int j=arr.length-1;

        while( i < j){
            if( arr[i] == 1){
                i++;
            }
            else if( arr[j] == 0){
                j--;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }      
        
    }  
    public static void main(String args[]){
        int arr[]={ 1, 0,0,0,1,1,0,1};

        sort(arr);
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
