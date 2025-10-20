import java.util.LinkedHashMap;

public class LinkedHashMapJCF {
    public static void main(String[] args) {
        // Stores the key values pairs in order as it was inserted
        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();

        lh.put("India", 110);
        lh.put("Bhutan", 20);
        lh.put("Nepal", 40);

        System.out.println(lh);
    }
}
