import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // For each string, compute the sorted-key and add to map
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];

            // create char array, sort it, make key
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // if key not present, create new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }

            // add original string to the group
            map.get(key).add(s);
        }

        // Prepare result list
        List<List<String>> result = new ArrayList<>();
        for (String k : map.keySet()) {
            result.add(map.get(k));
        }

        return result;
    }

    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> groups = groupAnagrams(input);

        // Print groups
        for (int i = 0; i < groups.size(); i++) {
            System.out.println(groups.get(i));
        }
    }
    
}
