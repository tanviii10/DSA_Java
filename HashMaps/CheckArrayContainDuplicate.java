import java.util.HashMap;

public class CheckArrayContainDuplicate {

    public static boolean check( int arr[]){

        HashMap<Integer , Boolean> map=new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            int num=arr[i];

            if(map.containsKey(num)){
                return true;
            }
            else{
                map.put(num, true);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[]={1,4,5};

        boolean res=check(arr);

        System.out.println(res);
    }
    
}
