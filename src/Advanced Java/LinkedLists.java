import java.util.*;
public class LinkedLists {
    public static void main(String[] args) {
//        https://www.baeldung.com/java-array-deque
       LinkedList<Integer> l1 = new LinkedList<>();
       LinkedList<Integer> l2 = new LinkedList<>();
       l1.add(1);
       l1.add(2);
       l2.add(3);
       l2.add(4);
       l1.addAll(l2);
       l1.addLast(5);
       l1.addFirst(0 );
       for(int ele: l1)
           System.out.println(ele);
    }
}
