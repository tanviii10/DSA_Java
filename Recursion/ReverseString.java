public class ReverseString {

    public static void reverse(char arr[], int i,int j){

        if( i >= j)
            return ;

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

        reverse(arr, i, j);
    }
    public static void main(String[] args) {

        String str = "Maza domla";

        char[] arr = str.toCharArray();

        reverse(arr, 0, arr.length - 1);

        System.out.println(new String(arr));
    }
    
}
