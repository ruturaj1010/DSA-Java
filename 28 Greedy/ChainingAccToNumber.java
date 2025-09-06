import java.util.Arrays;
import java.util.Comparator;

public class ChainingAccToNumber {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int LastEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if ( pairs[i][0] >= LastEnd) {
                chainLen++;
                LastEnd = pairs[i][1];
            }
        }

        System.out.println("Longest chain formed is of length " + chainLen);
    }
}