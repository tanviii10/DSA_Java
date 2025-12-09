import java.util.Arrays;

public class StringCompression {

    public static int compress(char[] chars) {

        if (chars == null || chars.length == 0) return 0;

        int write = 0;                 
        for (int i = 0; i < chars.length; ) {
            char current = chars[i];
            int j = i;

            // count how many times current repeats
            while (j < chars.length && chars[j] == current) {
                j++;
            }

            int count = j - i;         // occurrences of current

            chars[write++] = current;

            // if count > 1, write its digits
            if (count > 1) {
                String cntStr = Integer.toString(count);
                for (int k = 0; k < cntStr.length(); k++) {
                    chars[write++] = cntStr.charAt(k);
                }
            }
            i = j;
        }
        return write;
    }
    public static void main(String[] args) {

        char[] chars1 = {'a','a','b','b','c','c','c'};
        int newLen1 = compress(chars1);
        System.out.println("Compressed length: " + newLen1);
        System.out.println("Compressed array: " + Arrays.toString(Arrays.copyOf(chars1, newLen1)));
       

        
        char[] chars2 = {'a'};
        int newLen2 = compress(chars2);
        System.out.println("Compressed length: " + newLen2);
        System.out.println("Compressed array: " + Arrays.toString(Arrays.copyOf(chars2, newLen2)));
    

      
        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int newLen3 = compress(chars3);
        System.out.println("Compressed length: " + newLen3);
        System.out.println("Compressed array: " + Arrays.toString(Arrays.copyOf(chars3, newLen3)));
        
    }
}
