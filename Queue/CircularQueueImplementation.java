public class CircularQueueImplementation {

    static int[] arr;
    static int front;
    static int rear;
    static int size;

    static void CircularQueueLove(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // enqueue
    static void enqueue(int data) {

        // full condition
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

        // first element
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // dequeue
    static int dequeue() {

        // empty condition
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int ans = arr[front];

        // single element case
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return ans;
    }

    // front element
    static int frontElement() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // display
    static void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueueLove(5);

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();

        dequeue();
        dequeue();

        enqueue(50);
        enqueue(60);

        display();

        System.out.println("Front Element: " + frontElement());
    }
    
}
