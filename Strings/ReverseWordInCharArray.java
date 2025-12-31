import java.util.Arrays;

public class ReverseWordInCharArray {

    public static void reverse( char s[], int left, int right){

        while( left  < right ){

            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }
    public static void reverseWords( char s[]){

        reverse( s,0, s.length-1);

        int start=0;
        for(int i=0; i<= s.length ; i++){

                if( i == s.length || s[i] == ' '){
                reverse(s, start, i-1);
                start= i + 1;
            }
        }
    }
    
    public static void main(String[] args) {
        
        char[] s = {
            't','h','e',' ',
            's','k','y',' ',
            'i','s',' ',
            'b','l','u','e'
        };

        System.out.println("Original: " + Arrays.toString(s));

        reverseWords(s);  

        System.out.println("Reversed Words: " + Arrays.toString(s));
    }
}
