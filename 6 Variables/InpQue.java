import java.util.Scanner;

public class InpQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int num2 = sc.nextInt();

        System.out.println("sum of two numbers is : "+ (num1 + num2) );
        System.out.println("difference of two numbers is : "+ (num1 - num2) );
        System.out.println("product of two numbers is : "+ (num1 * num2) );

        sc.close();
    }
}
