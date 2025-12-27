import java.util.ArrayList;

public class LetterCombinations {

    static void solve(String digits, int index, String output,
                      String[] mapping, ArrayList<String> ans) {

        // Base case
        if (index == digits.length()) {
            ans.add(output);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = mapping[digit];

        for (int i = 0; i < letters.length(); i++) {
            solve(digits, index + 1, output + letters.charAt(i), mapping, ans);
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        if (digits.length() == 0) {
            System.out.println("[]");
            return;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        ArrayList<String> ans = new ArrayList<>();

        solve(digits, 0, "", mapping, ans);

        System.out.println(ans);
    }
}
