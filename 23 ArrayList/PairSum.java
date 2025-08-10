import java.util.ArrayList;

public class PairSum {
    public static void pairSumBrute(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("pair exist at index " + i + " and " + j);
                    return;
                }
            }
        }
    }

    public static void pairSum2Pointer(ArrayList<Integer> list, int target ) {
        int lp = 0;
        int rp = list.size()-1;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println("pair exist at index " + lp + " and " + rp);
                return;
            } else if (list.get(lp) + list.get(rp) < target ) {
                lp++;
            } else {
                rp--;
            }
        }

        System.out.println("Pair not found");
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        // pairSumBrute(list, 5);

        pairSum2Pointer(list, 5);
    }
}
