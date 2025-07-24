public class binomialCoefficient {

    public static int factorial(int n) {
        int fact = 1;

        for(int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int binoCoef(int n , int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        return a / (b *c);
    }

    public static void main(String[] args) {
        int n = 5, r = 2;

        System.out.println("Binomial Coefficient " + binoCoef(n , r));
    }
}
