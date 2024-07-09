import java.util.LinkedList;
public class LLinsert {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.addFirst(0);
        linkedList.addLast(4);

        // Use List interface's get() method to access elements by index
        System.out.println(linkedList.get(1));  // Output: 1
    }
}
