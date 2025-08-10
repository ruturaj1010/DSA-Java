import java.util.ArrayList;

public class pairSumSortedRotated {

    public static void pairSum2Pointer(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                lp = i + 1;
                rp = i;
                break;
            }
        }

        System.out.println(lp + " " + rp);

        int ArrSize = list.size();
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println("Found at index " + lp + " " + rp);
                return;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % ArrSize;
            } else {
                rp = (ArrSize + rp - 1) % ArrSize;
            }
        }

        System.out.println("Pair doesn`t exist.");
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        pairSum2Pointer(list, 16);
    }
}
