public class BinaryStringwithoutCons0 {
    public static void withoutCons0(int n, String str, int lastDigit) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        withoutCons0(n - 1, str + "1", 1);

        if (lastDigit != 0) {
            withoutCons0(n - 1, str + "0", 0);
        }
    }

    public static void main(String[] args) {
        withoutCons0(3,"" , 1 );
    }
}
