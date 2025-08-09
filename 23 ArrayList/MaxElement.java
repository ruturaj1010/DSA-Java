import java.util.ArrayList;

public class MaxElement {
    public static void findMax(ArrayList<Integer> list) {
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (maxEle < list.get(i)) {
                maxEle = list.get(i);
            }
        }

        System.out.println("Maximum element is " + maxEle);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(7);
        list.add(2);

        findMax(list);
    }
}
