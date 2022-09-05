import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(6);
        l1.addAll(l2);
        l1.remove(3);
        l1.indexOf(6);
        l1.lastIndexOf(6);
        for(int ele: l1)
            System.out.println(ele);
    }
}
