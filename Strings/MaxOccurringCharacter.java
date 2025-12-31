public class MaxOccurringCharacter{

    public static char getMaxOccurringCharacter(String s){

        int freq[]= new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);      
            int index = ch - 'a';       
            freq[index]++;             
        }

        int maxFreq = 0;
        char result = 'a';

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