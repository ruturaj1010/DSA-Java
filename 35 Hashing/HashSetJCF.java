import java.util.*;

public class HashSetJCF {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(4);

        System.out.println(hs);

        if (hs.contains(2)) {
            System.out.println("Contains");
        } else {
            System.out.println("Do not contains");
        }

        if (hs.contains(2)) {
            System.out.println("removed element 2 = " + hs.remove(2));
        }

        // hs.clear();  // clears all elements in a Set
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

        hs.add(1);
        hs.add(12);
        hs.add(4);
        hs.add(6);
        hs.add(4);

        Iterator<Integer> it = hs.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        for (Integer ele : hs) {
            System.out.print(ele + " ");
        }
    }
}
