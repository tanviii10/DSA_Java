public class CheckPalindrom {

    public static boolean check(char arr[],int i,int j){

        if(i > j)
            return true;

        if( arr[i] != arr[j]){
            return false;
        }
        else{
            return check(arr, i+1, j-1);
        }
    }
    public static void main(String[] args) {
        
        String str="aabbaab";

        char arr[]=str.toCharArray();

        System.out.println(" is string palindrome ? "+ check(arr, 0, arr.length-1));
    }
    
}
