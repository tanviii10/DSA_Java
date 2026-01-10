public class QueueArrayImplementation {

    static int[] arr;
    static int front;
    static int rear;
    static int size;

    static void QueueArrayLove(int n) {
        size = n;
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    // push (enqueue)
    static void enqueue(int data) {

        // overflow
        if (rear == size) {
            System.out.println("Queue Overflow");
            return;
        }

        arr[rear] = data;
        rear++;
    }

    // pop (dequeue)
    static int dequeue() {

        // underflow
        if (front == rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int ans = arr[front];
        front++;

        // reset when queue becomes empty
        if (front == rear) {
            front = 0;
            rear = 0;
        }

        return ans;
    }

    // get front element
    static int frontElement() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // check empty
    static boolean isEmpty() {
        return front == rear;
    }

    // display
    static void display() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {

        QueueArrayLove(5);

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();

        System.out.println("Deleted: " + dequeue());
        System.out.println("Front Element: " + frontElement());

        display();
    }
    
}
