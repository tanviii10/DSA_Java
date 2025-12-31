public class RemoveAllOccOfSubstring {

    public static String remove( String s, String part){

        StringBuilder sb=new StringBuilder();
        
        int m = part.length();

        for( char ch : s.toCharArray()){
            sb.append(ch);

            if( sb. length() >= m){
                if( sb.substring(sb.length()-m).equals(part)){
                sb.delete(sb.length() - m, sb.length());
                }   
            }
        }

        return sb.toString();        
    }

    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";

        String result = remove(s, part);

        System.out.println("Original String: " + s);
        System.out.println("Substring to remove: " + part);
        System.out.println("Result after removal: " + result);
    }
    
}
