public class swapping {

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b =10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        swap(a, b);

    }
}
