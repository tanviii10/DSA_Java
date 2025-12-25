import java.util.Scanner;

public class CountDistinctWayToClimbStair {

    public static int countWay(int nStair){

        if(nStair < 0)
            return 0;

        if(nStair == 0)
            return 1;

        int ans=countWay(nStair-1)+ countWay(nStair-2);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no of stairs ");
        int nStair=sc.nextInt();

        System.out.println("count of disticnt ways : "+ countWay(nStair));
        sc.close();

    }

//     countWays(3)
//  ├─ countWays(2)
//  │   ├─ countWays(1)
//  │   │   ├─ countWays(0) → 1
//  │   │   └─ countWays(-1) → 0
//  │   └─ countWays(0) → 1
//  └─ countWays(1)
//      ├─ countWays(0) → 1
//      └─ countWays(-1) → 0

}
