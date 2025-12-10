import java.util.HashMap;

public class CountFreqOfNumInArray {

    public static void calFreq( int arr[]){

        HashMap<Integer ,Integer> map=new HashMap<>();

        for( int i=0 ; i< arr.length ;i++){
            int num=arr[i];

            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        for (int key : map.keySet()){
            System.out.println(key +" : "+ map.get(key));
        }
    }

    public static void main(String[] args) {
        
        int arr[]={ 2,2,4,5,6,6,6,7,2};

        calFreq(arr);
    }
}
