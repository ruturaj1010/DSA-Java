import java.util.Scanner;

public class sum {

    // functions occupy memory in the form of callstack and when the function executes the memory is released by that function

    public static int sumOfNum(int a, int b) {   // paranthesis or formal parameters
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();

        int sum = sumOfNum(a, b);  // arguments or actual parameters
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        sc.close();
    }
}
