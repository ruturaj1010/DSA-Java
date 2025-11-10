import java.util.ArrayList;

public class CycleDetectDirGraph {
    static class Edge {
        int src;
        int des;

        Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    public static boolean CycleDetection(ArrayList<Edge> graph[]) {

        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (cycleDetectionUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean cycleDetectionUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.des]) {
                return true;
            } else if (!vis[e.des]) {
                return cycleDetectionUtil(graph, e.des, vis, stack);
            }
        }
        stack[curr] = false;

        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[4];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));

        System.out.println(CycleDetection(graph));
    }
}
