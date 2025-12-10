import java.util.HashMap;

public class MostFrequentElement {

    public static int mostFrequent( int arr[]){

        HashMap<Integer,Integer > map=new HashMap<>();
        for( int i=0; i< arr.length ;i++){
            int num=arr[i];

            if( map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        int maxFreq=0;
        int ans=-1;

        for(int key : map.keySet()){
            int freq=map.get(key);

            if(freq > maxFreq){
                maxFreq = freq;
                ans =key;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 2, 3};

        int result = mostFrequent(arr);
        System.out.println("Most frequent element: " + result);
    }
    
}
