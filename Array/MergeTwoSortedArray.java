public class MergeTwoSortedArray {

    public static void merg(int arr1[], int arr2[], int arr3[]){

        int n= arr1.length;
        int m=arr2.length;

        int i=0, j=0;
        int k=0;

        while( i < n && j < m){

            if( arr1[i] < arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while( i < n){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while( j< m){
            arr3[k]= arr2[j];
            k++;
            j++;
        }

    }

    public static void main(String[] args) {
        
        int arr1[]={ 2,4,6,8,12,14};
        int arr2[]={ 1,3,5,7,9,17,23,34,37,89};

        int[] arr3 = new int[arr1.length + arr2.length];

        merg(arr1, arr2, arr3);

        System.out.println("merged array is: ");

        for( int num : arr3){
            System.out.print(num +" ");
        } 
    }   
    
}
