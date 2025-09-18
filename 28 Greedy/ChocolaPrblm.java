import java.util.Arrays;
import java.util.Collections;

public class ChocolaPrblm {
    public static void main(String args[]) {
        Integer vertCost[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer horiCost[] = { 4, 1, 2 }; // n-1

        Arrays.sort(vertCost, Collections.reverseOrder());
        Arrays.sort(horiCost, Collections.reverseOrder());

        int v = 0, h = 0;
        int vp = 1, hp = 1;
        int cost = 0;

        while (v < vertCost.length && h < horiCost.length ) {
            if (vertCost[v] <= horiCost[h]) { // horizontal cut
                cost += (horiCost[h] * vp);
                hp++;
                h++;
            } else {
                cost += (vertCost[v] * hp);
                vp++;
                v++;
            }
        }

        while (v < vertCost.length) {
            cost += (vertCost[v] * hp);
            vp++;
            v++;
        }

        while (h < horiCost.length) {
            cost += (horiCost[h] * vp);
            hp++;
            h++;
        }

        System.out.println("Minimum cost of cutting pieces is " + cost);
    }
}
