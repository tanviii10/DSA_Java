import java.util.HashMap;

public class WordCount {

    public static void count(String s){

        String [] words=s.split(" ");

        HashMap<String, Integer> map= new HashMap<>();
        for( int i=0 ; i< words.length ;i++){
            String word=words[i];

            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        for( String key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
    public static void main(String[] args) {
        
        String sentence = "java is great and java is powerful";

        count(sentence);
    }
}
