public class DequeImplementation {

    static int[] arr;
    static int front;
    static int rear;
    static int size;

    static void DequeLove(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // insert at front
    static void insertFront(int data) {

        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Deque Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }

        arr[front] = data;
    }

    // insert at rear
    static void insertRear(int data) {

        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Deque Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }

        arr[rear] = data;
    }

    // delete from front
    static int deleteFront() {

        if (front == -1) {
            System.out.println("Deque Underflow");
            return -1;
        }

        int ans = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }

        return ans;
    }

    // delete from rear
    static int deleteRear() {

        if (front == -1) {
            System.out.println("Deque Underflow");
            return -1;
        }

        int ans = arr[rear];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }

        return ans;
    }

    // display deque
    static void display() {

        if (front == -1) {
            System.out.println("Deque is Empty");
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

    // main
    public static void main(String[] args) {

        DequeLove(5);

        insertRear(10);
        insertRear(20);
        insertFront(5);
        insertFront(2);

        display();

        System.out.println("Deleted Front: " + deleteFront());
        System.out.println("Deleted Rear: " + deleteRear());

        display();
    }
    
}
