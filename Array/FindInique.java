public class FindInique {

    public static int uniqueEle(int arr[]){
        int ans=0;

        for(int i=0; i<arr.length ; i++){
            ans=ans ^ arr[i];
            //XOR 
            //n is arr ele = 2m+1 (odd ele)
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int arr[]={2,5,2,7,5,9,7};

        System.out.println("unique element is : "+uniqueEle(arr));
    }
    
}
