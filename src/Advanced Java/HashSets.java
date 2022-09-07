import java.util.HashSet;
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(5,0.5f);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(4);
        System.out.println(h);
        System.out.println(h.size());
    }
}
