public class ReverseString {

    public static String Reverse(char arr[]){

        int left=0;
        int right=arr.length-1;

        while( left < right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        
        String str="tanvi";
        char[] arr = str.toCharArray();

        System.out.println(Reverse(arr));
    }
    
}
