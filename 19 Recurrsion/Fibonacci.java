public class Fibonacci {
    public static int printFib(int num) {
        if(num == 0) {
            return 0;
        }
        if(num == 1) {
            return 1;
        }

        return printFib(num-1) + printFib(num-2);
    }
    public static void main(String args[]) {
        System.out.println(printFib(10));
    }
}
