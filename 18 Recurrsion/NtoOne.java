import java.util.Scanner;

public class NtoOne {
    public static void printNumbersFromNto1(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");

        printNumbersFromNto1(n - 1);

    }

    public static void printNumbersFrom1toN(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printNumbersFrom1toN(n - 1);
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        printNumbersFromNto1(num);

        System.out.println();

        printNumbersFrom1toN(num);

        sc.close();
    }
}
