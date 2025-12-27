public class SubSequencesOfString {

    public static void genrateSubsequences(String str, int index, String output){

        if( index == str.length() ){
            System.out.println(output);
            return;
        }

        //Exclude
        genrateSubsequences(str, index+1, output);

        //Include
        genrateSubsequences(str, index+1, output + str.charAt(index));
    }
    public static void main(String[] args) {
        
        String str="abc";

        genrateSubsequences(str, 0, " ");
    }
}
