import java.util.Arrays;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count freq of s1
        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        int window = s1.length();

        // First window of s2
        for (int i = 0; i < window; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // If first window matches
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        // Slide the window
        for (int i = window; i < s2.length(); i++) {

            // Add new character
            freq2[s2.charAt(i) - 'a']++;

            // Remove old character
            freq2[s2.charAt(i - window) - 'a']--;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean ans = checkInclusion(s1, s2);
        System.out.println("Does s2 contain a permutation of s1? → " + ans);
    }
}

    

