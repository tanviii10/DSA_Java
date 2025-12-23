public class StackImplementation {

    static int[] stack;
    static int top=-1;
    static int size;

    //create stack
    static void createStack(int n){
        size=n;
        stack =new int[size];
    }

    //push 
    static void push(int value){
        if(top == size-1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top]=value;
        System.out.println(value+" pushed in stack");
    }

    //pop
    static void pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return;
        }
        System.out.println(stack[top]+ " poped from stack");
        top--;
    }

    //peek
    static void peek(){
        if(top == -1){
            System.out.println("stack is empty ");
            return;
        }
        System.out.println("top element in stack "+ stack[top]);
    }

    //isEmpty
    static boolean isEmpty(){
        return top== -1; 
    }

    public static void main(String[] args) {
        
        createStack(5);

        push(10);
        push(20);
        push(30);
        push(50);

        peek();

        pop();
        pop();

        peek();

        System.out.println("is empty "+ isEmpty());
    }
    
}
