import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer Coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000 };

        Arrays.sort(Coins, Comparator.reverseOrder());

        int Rupees = 593;
        int countOfCoins = 0;
        ArrayList<Integer> count = new ArrayList<>();
        // Assuming arr of coins is sorted
        for (int i = 0; i < Coins.length; i++) {
            if (Rupees >= Coins[i]) {
                while (Rupees >= Coins[i]) {
                    countOfCoins++;
                    Rupees -= Coins[i];
                    count.add(Coins[i]);
                }
            }
        }

        System.out.println("Total coins required are " + countOfCoins);

        for (int i = 0; i < count.size(); i++) {
            System.out.print(count.get(i)+" ");
        }
    }
}
