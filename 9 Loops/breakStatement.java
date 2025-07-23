import java.util.Scanner;

public class breakStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            if ((num % 10) == 0) {
                break;
            }
            System.out.println("Entered number is: " + num);

        } while (true);

        sc.close();
    }
}
