
public class LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        //list.print();
       
        list.addLast(2);
        //list.print(); 
       
        list.addFirst(0);
        //list.print();
       
        list.addFirst(-1);
        //list.print();
       
        list.addLast(3);
        //list.print();
       
        list.addIndex(2, 5);
        //list.print();

        System.out.println(list.size);
        //list.removeLast();
        
        list.print();
        // System.out.println(list.size);
        // System.out.println(-1+" at index: "+list.searchIndex(-1));
        // System.out.println(3+" at index: "+list.recSearchIndex(3));
        // System.out.println(10+" at index: "+list.recSearchIndex(10));
        list.reverse();
        list.print();
        //System.out.println(LinkedList.size);// will be accessed with class name
    //    list.removeFirst();list.removeFirst();list.removeFirst();list.removeFirst();
    //    list.removeFirst();list.removeFirst();list.removeFirst();list.removeFirst();


       System.out.println(list.isPalindrome(head));
        
    }
    // private Node head;
    // private Node tail;
    private int size;
    public static Node head;
    public static Node tail;
    //public static int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
             head = tail = newNode;
        }
        else{
           newNode.next = head;
           head = newNode;
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data +"->");
            current = current.next;
        }
        System.out.println("null");

    }
    public void addIndex(int index, int data){
        if(index == 0){
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < index-1){
            i++;
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void removeFirst(){
        try {
            
        if(size == 0){
            System.out.println("LL is already empty");
            return;
        }else if(size == 1){
            head = tail = null;
            size = 0;
            // return;
        }
        head = head.next;
        size--;
        print();
        } catch (Exception e) {
            System.out.println("removeFirst called list is empty");
        }

    }
    public void removeLast(){
        try {
            if(size == 0){
                System.out.println("List is empty");
            }else if(size == 1){
                head = tail = null;
                size = 0;
            }
           
           Node secLast; Node last;
           secLast = head;
           last = head.next;

           while(last.next != null){
            secLast = secLast.next;
            last = last.next;
           }

           secLast.next = null;
           tail = secLast;
           size--;

        } catch (Exception e) {
            System.out.println("removeLast called list is empty ");
        }
    }
    public int searchIndex(int data){
        if(head == null){
            return 0;
        }else{
            int index = 0;
            Node temp = head;
            while(temp != null){
               
                if(temp.data == data){
                  return index;
                }
                temp = temp.next;
                index++;
            }
            return -1;
        }
    }
    public int helper(Node head, int data){
        if(head == null){
            return -1;
        }
        if (head.data == data){
            return 0;
        }
        int index = helper(head.next, data);
        if(index == -1){
            return -1;
        }
       return  index+1;
    }
    public int recSearchIndex(int data){
        return helper(head, data);
    }
    // reverse the linkedlist
    public void reverse(){
        Node pre = null;
        Node cur = head;
        Node next;

        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head = pre;
    }
    // check palindrom

    public Node findMidNode(Node head){
        Node slow = head; Node fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next;
        }
        return slow; // return slow instead of fast
    }
    
    public boolean isPalindrome(Node head){
        // find the mid
        Node mid = findMidNode(head);
        //reverse the right part
        if(head == null || head.next == null){
            return true;
        }
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right points to the reversed right half
        Node left = head;
        // check left and right part both are equal or not
        while(right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
}






    