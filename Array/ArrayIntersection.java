import java.util.Arrays;

public class ArrayIntersection {

    public static void intersection(int arr1[], int arr2[]){

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0, j=0;

        while( i < arr1.length && j< arr2.length){

            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }
            else if( arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }

        }
    }

    public static void main(String[] args) {
        
        int arr1[]={2,7,8,3,9,5,1,50};
        int arr2[]={5,8,34,67,4,3,56};

        System.out.println("intersection elements are : ");
        intersection(arr1, arr2);
    }
    
}
