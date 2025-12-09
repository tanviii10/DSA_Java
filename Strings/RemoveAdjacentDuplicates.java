public class RemoveAdjacentDuplicates {

    public static String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // if stack not empty AND top element is same → remove it
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == curr) {
                sb.deleteCharAt(sb.length() - 1); 
            } else {
                sb.append(curr);  
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        
        String s = "abbaca";
        String result = removeDuplicates(s);

        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }

    
}
