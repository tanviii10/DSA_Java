public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        
        if (s == null) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // move left forward until an alphanumeric char or left >= right
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // move right backward until an alphanumeric char or left >= right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // compare lowercase versions
            char cl = Character.toLowerCase(s.charAt(left));
            char cr = Character.toLowerCase(s.charAt(right));

            if (cl != cr) return false;

            left++;
            right--;
        }

        return true;
    }

    // small test
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(vp.isPalindrome("race a car")); // false
        System.out.println(vp.isPalindrome("0P")); // false (LeetCode example)
    }
}
