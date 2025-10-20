import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapJCF {
    public static void main(String[] args) {
        // Stores the key values pairs in order as it was inserted
        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();

        lh.put("India", 110);
        lh.put("Bhutan", 20);
        lh.put("Nepal", 40);

        System.out.println(lh);

        // time complexity - O(logn)  gets data in sorted order
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 110);
        tm.put("Bhutan", 20);
        tm.put("Nepal", 40);

        System.out.println(tm);
    }
}
