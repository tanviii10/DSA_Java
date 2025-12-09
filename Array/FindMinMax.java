public class FindMinMax {

    public static int getMin( int arr[]){
        int min=arr[0];

        for(int i=1 ; i < arr.length ; i++){
            if(arr[i]< min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int getMax(int arr[]){
        int max=arr[0];

        for(int i=1 ; i< arr.length ; i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        
        int arr[]={2 , 5, 7, 9, 23 , 7 ,-1};

        System.out.println("minimum : "+ getMin(arr));
        System.out.println("maximum : "+ getMax(arr));
    }
}
