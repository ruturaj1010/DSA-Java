import java.util.Scanner;

public class factorials {
    public static int isFactorial(int n) {
        int fact = 1;

        for(int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();

        int result = isFactorial(n);
        System.out.println("The factorial of " + n + " is: " + result);

        sc.close();
    }
}
