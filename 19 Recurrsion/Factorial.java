import java.util.*;

public class Factorial {
    public static int printFact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * printFact(num-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println(printFact(num));

        sc.close();
    }
}
