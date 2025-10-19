import java.util.PriorityQueue;

public class SlidingWindowMax {
    static class Window implements Comparable<Window> {
        int ele;
        int idx;

        Window (int ele, int idx) {
            this.ele = ele;
            this.idx = idx;
        }

        @Override
        public int compareTo(Window w2) {
            return w2.ele - this.ele;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Window> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Window(arr[i], i));
        }

        res[0] = pq.peek().ele;

        for (int i = k; i < arr.length; i++) {
            pq.add(new Window(arr[i], i));

            while (pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq.remove();
            }

            res[i-k+1] = pq.peek().ele;
        }

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
