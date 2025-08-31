import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int tcapacity = 50;

        double sorted[][] = new double[val.length][3];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i][0] = (double)val[i] / weight[i];
            sorted[i][1] = val[i];
            sorted[i][2] = weight[i];
        }
        Arrays.sort(sorted, Comparator.comparingDouble(o -> o[0]));

        double tval = 0;
        for (int i = sorted.length-1; i >= 0; i--) {
            if (sorted[i][2] <= tcapacity) {
                tval += sorted[i][1];
                tcapacity -= sorted[i][2];
            } else {
                tval += (tcapacity * sorted[i][0]);
                tcapacity = 0;
                break;
            }
        }

        System.out.println("Total value is " + tval + " in weight 50.");
    }
}
