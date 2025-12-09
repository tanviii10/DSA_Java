import java.util.ArrayList;

public class RemoveDuplicate {

    static ArrayList<Integer> removeDuplicate(int arr[]){

        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;

        if(n ==0) return res;
        res.add(arr[0]);

        for(int i=1 ; i< n ;i++){
            if(arr[i] != arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,4,5,5,};

        ArrayList<Integer> res=removeDuplicate( arr);
        System.out.println(res);
    }
    
}
