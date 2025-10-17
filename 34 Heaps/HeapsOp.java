import java.util.ArrayList;

public class HeapsOp {

    static class Heap {

        ArrayList<Integer> h = new ArrayList<>();

        public void add(int data) {
            h.add(data);

            int x = h.size() - 1; // index of child node
            int par = (x - 1) / 2; // index of parent element

            while (h.get(x) < h.get(par)) {
                int temp = h.get(x);
                h.set(x, h.get(par));
                h.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

    }

    public static void main(String[] args) {

        Heap h1 = new Heap();
        h1.add(4);
        h1.add(7);
        h1.add(1);
        h1.add(5);

        for (int i = 0; i < h1.h.size(); i++) {
            System.out.print(h1.h.get(i) + " ");
        }
    }
}
