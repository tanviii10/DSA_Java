import java.util.HashMap;

public class CountfreqOfEachChar{

    public static void countFreq( String s){

        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0 ; i< s.length(); i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        for(char key : map.keySet()){
            System.out.println(key+" : "+ map.get(key));
        }
    }

    public static void main(String[] args) {
        String s= "aaabbcdddd";

        countFreq(s);

    }
}