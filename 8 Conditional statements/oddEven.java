import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // if ((num % 2) == 0) {
        // System.out.println("Number is even");
        // } else {
        // System.out.println("Number is odd");
        // }

        // int a = 5, b = 6, c = 2;

        // if (a > b && a > c) {
        //     System.out.println("a is the largest number");
        // } else if (b > a && b > c) {
        //     System.out.println("b is the largest number");
        // } else {
        //     System.out.println("c is the largest number");
        // }

        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if( (year % 4) == 0 || (year % 100) == 0 || (year % 400) == 0) {
            System.out.println("Year is a leap year");
        } else  {
            System.out.println("Year is not a leap year");
        }

        sc.close();
    }
}
