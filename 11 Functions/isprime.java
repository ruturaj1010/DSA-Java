import java.util.Scanner;

public class isprime {
    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }

        for (int i = 2; i<= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if(isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not: ");
        int num = sc.nextInt();

        if (isPrime(num)){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        };

        primeInRange(2, 20);

        sc.close();
    }
}