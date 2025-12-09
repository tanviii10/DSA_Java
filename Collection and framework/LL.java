public class LL {

    Node head;
    private int size;

    LL () {
       size = 0;
   }

    public class Node {
       String data;
       Node next;
       Node(String data) {
           this.data = data;
           this.next = null;
           size++;
       }
   }


   public void addFirst(String data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
   }


   public void addLast(String data) {
       Node newNode = new Node(data);
       if(head == null) {
           head = newNode;
           return;
       }

       Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }

       lastNode.next = newNode;
   }


   public void printList() {
       Node currNode = head;

       while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
       }
       System.out.println("null");
   }

   

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("this is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
         if(head == null){
            System.out.println("this is empty");
            return;
        }

        size--;
        if(head.next == null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }



    public void reverseList() {
       if(head == null || head.next == null) {
           return;
       }

       Node prevNode = head;
       Node currNode = head.next;
       while(currNode != null) {
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
   }

   public Node reverseListRecursive(Node head) {
       //empty node || last node or only one node
       if(head == null || head.next == null) {
           return head;
       }

       Node newHead = reverseListRecursive(head.next);
      
       head.next.next = head;
       //2-3->2
       head.next = null;
       return newHead;
   }



    public static void main(String[] args) {
     LL list = new LL();
       list.addLast("b");
       list.addLast("c");
       list.addLast("d");
       list.printList();

       list.addFirst("a");
       list.printList();

    //    list.deleteFirst();
    //    list.printList();
    //    list.deleteLast();
    //    list.printList();

       System.out.println(list.getSize());

    //    list.reverseList();
    //    list.printList();

      list.head=list.reverseListRecursive(list.head);
      list.printList();
   }
}
