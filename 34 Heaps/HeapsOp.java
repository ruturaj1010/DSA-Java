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

        public int peek() {
            return h.get(0);
        }

        private void heapify(int i) {
            int minIdx = i;
            int left = 2*i + 1;
            int right = 2*1 + 2;

            if (left < h.size()-1 && h.get(minIdx) > h.get(left)) {
                minIdx = left;
            }

            if (right < h.size()-1 && h.get(minIdx) > h.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = h.get(i);
                h.set(i, h.get(minIdx));
                h.set(minIdx, temp);
            }
        }
        public int remove() {
            
            if (h.isEmpty()) {
                return -1;
            }

            int data = h.get(0);
            
            // Swap first and last ele
            int temp = h.get(0);
            h.set(0, h.get(h.size()-1));
            h.set(h.size()-1, temp);

            // delete the last element
            h.remove(h.size()-1);

            // heapify the heap tree
            heapify(0);

            return data;
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
        System.out.println();

        h1.remove();
        h1.remove();
        for (int i = 0; i < h1.h.size(); i++) {
            System.out.print(h1.h.get(i) + " ");
        }
    }
}
