class SecondLargest{

    static int findSecLarge(int arr[]){

        int largest=arr[0];
        int sLargest=-1;

        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] > largest){
                sLargest= largest;
                largest= arr[i];
            }
            else if(arr[i] < largest && arr[i]> sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }

    public static void main(String[] args){
        int arr[]={4, 7, 6, 1 ,3 ,9,6};

        System.out.println("SecondLargest is : "+ findSecLarge(arr));
    }
}