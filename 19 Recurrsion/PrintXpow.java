public class PrintXpow {
    public static int xToPowN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xToPowN(x, n - 1);
    }

    public static int optixToPowN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = optixToPowN(x, n / 2);

        int halfPowSq = halfPow * halfPow;

        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }

        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(xToPowN(2, 2));

        System.out.println(optixToPowN(2, 2));
    }
}