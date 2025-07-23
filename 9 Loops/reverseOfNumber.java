public class reverseOfNumber {
    public static void main(String[] args) {
        int num = 100409;

        while (num != 0) {
            int digit = num%10;
            System.out.print(digit);
            num/=10;
        }   
    }
}
