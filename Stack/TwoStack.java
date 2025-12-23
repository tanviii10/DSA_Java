public class TwoStack {

    static int[] arr;
    static int size;
    static int top1, top2;

    static void twoStack(int n){
        size = n;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    // push in stack1
    static void push1(int value){
        if(top2 - top1 > 1){
            top1++;
            arr[top1] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // push in stack2
    static void push2(int value){
        if(top2 - top1 > 1){
            top2--;
            arr[top2] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // pop from stack1
    static int pop1(){
        if(top1 >= 0){
            int ans = arr[top1];
            top1--;
            return ans;
        }
        return -1;
    }

    // pop from stack2
    static int pop2(){
        if(top2 < size){
            int ans = arr[top2];
            top2++;
            return ans;
        }
        return -1;
    }

    public static void main(String[] args) {

        twoStack(6);

        push1(10);
        push1(20);

        push2(100);
        push2(200);

        System.out.println(pop1()); 
        System.out.println(pop2()); 
    }
}
