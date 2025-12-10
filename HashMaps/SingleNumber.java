import java.util.HashMap;

public class SingleNumber {

    public static int singleNumber(int arr[]){

        HashMap< Integer,Integer> map=new HashMap<>();
        for( int i=0; i <arr.length; i++){
            int num=arr[i];

            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        for( int i=0 ; i< arr.length ;i++){
            int num=arr[i];

            if( map.get(num)== 1){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int arr[]={5,7,4,6,5,7,4};

        int res=singleNumber(arr);
        System.out.println(res);
    }
    
}
