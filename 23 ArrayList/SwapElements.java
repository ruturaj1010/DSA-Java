import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void swapElementsAtIndex(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2) );
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(7);
        list.add(3);

        System.out.println(list);
        // swapElementsAtIndex(list, 1, 3);
        // System.out.println(list);

        Collections.sort(list); // ascending order
        System.out.println(list);

        // descending order the param is comparator which defines the order of sorting or logic of fnc
        Collections.sort(list, Collections.reverseOrder()); 
        System.out.println(list);
    }
}
