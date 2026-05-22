import java.util.*;
public class ArrayIntersection {

    public static void intersection(int arr1[], int arr2[]){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=0, j=0;

        while( i < arr1.length && j < arr2.length){

            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if( arr1[i] < arr2[j] ){
                i++;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String args[]){

        int arr1[]={10,20,30,40,50};
        int arr2[]={34,35,67,50,10};

        intersection(arr1, arr2);
    } 
}
