import java.util.PriorityQueue;

public class NearestCarsToOrigin {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSQ;
        int idx;

        Point(int x, int y, int distSQ, int idx) {
            this.x = x;
            this.y = y;
            this.distSQ = distSQ;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSQ - p2.distSQ;
        }
    }
    public static void main(String[] args) {
        int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < points.length; i++) {
            int distSQ = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new Point(points[i][0], points[i][1], distSQ, i));
        }

        for(int i = 0; i < k; i++) {
            System.out.print("C" + pq.remove().idx + "\n");
        }
    }
}
