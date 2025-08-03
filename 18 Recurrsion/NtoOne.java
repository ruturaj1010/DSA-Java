import java.util.Scanner;

public class NtoOne {
    public static void printNumbersFromNto1(int n) {
        if ( n == 1 ){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");

        printNumbersFromNto1(n-1);

    }

    public static void printNumbersFrom1toN(int n, int count) {
        if ( count == n ) {
            System.out.print(count);
            return;
        }

        System.out.print(count + " ");

        printNumbersFrom1toN(n, ++count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        printNumbersFromNto1(num);

        System.out.println();
        
        printNumbersFrom1toN(num, 1);

        sc.close();
    }
}
