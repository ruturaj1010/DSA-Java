import java.util.ArrayList;

public class DefiningArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();

        // Add Operation - adding elements - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Add operation at index - O(n)
        list.add(1, 9);
        System.out.println(list);

        // Get operation - retrieving element - O(1)
        // int ele = list.get(2);
        // System.out.println(ele);

        // Delete Operation - deletes the element at index O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set Operation - sets the element at index by replacing previous element O(n)
        // list.set(3, 10);
        // System.out.println(list);

        // contains operation - Returns true false - O(n)
        // System.out.println(list.contains(3));
        // System.out.println(list.contains(13));
    }
}
