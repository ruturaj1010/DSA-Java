import java.util.HashMap;
import java.util.Set;

public class HashMapOperation {

    public static void iterateOnHM(HashMap<String, Integer> hm) {
        Set<String> values = hm.keySet();

        System.out.println(values);

        for (String k : values) {
            System.out.println("Key = " + k + " , " + "Value = " + hm.get(k));
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Inserting data - O(1)
        hm.put("US", 50);
        hm.put("Russia", 70);
        hm.put("India", 150);
        hm.put("China", 120);

        iterateOnHM(hm);

        // System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("US");
        // System.out.println(population);

        // System.out.println(hm.get("Israel"));

        // // containsKey - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Aus"));

        // // Remove - O(1)
        // System.out.println(hm.remove("US"));
        // System.out.println(hm.remove("NZ"));

        // // Size
        // System.out.println(hm.size());
        // System.out.println(hm);

        // // Empty
        // System.out.println(hm.isEmpty());

        // // Clear Hashmap
        // hm.clear();
        // System.out.println(hm.size());
    }
}
