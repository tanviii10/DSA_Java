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

        //1. Reverse entire array
        reverse( s,0, s.length-1);

        // 2. Reverse each word inside array
        int start=0;
        for(int end=0; end <= s.length ; end++){

            // When space or end of array → reverse previous word
            if( end== s.length || s[end] == ' '){
                reverse(s, start, end-1);
                start= end +1; // Move to next word
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
