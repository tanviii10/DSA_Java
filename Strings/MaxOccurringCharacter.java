public class MaxOccurringCharacter{

    public static char getMaxOccurringCharacter(String s){

        int freq[]= new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);      // get each character
            int index = ch - 'a';       // convert char to index (0 to 25)
            freq[index]++;              // increase its frequency
        }

        int maxFreq = 0;
        char result = 'a';

        // Check from 'a' to 'z' (lexicographical order)
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'a');
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(getMaxOccurringCharacter(s));  
    }
}