public class LongestSubstringOptimized {

    public static int lengthOfLongestSubstring(String s) {

        int[] hash = new int[256];

        // initialize with -1
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // if character seen and inside current window
            if (hash[ch] >= left) {
                left = hash[ch] + 1;
            }

            // update last seen index
            hash[ch] = right;

            // calculate window length
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s = "cadbzabcd";
        System.out.println("Longest length: " + lengthOfLongestSubstring(s));
    }
}

    

