public class functionOverloading {

    // the method overloading is dependent on no.of params and type of params
    // it is not dependent on return type we can change the return type but it will not be considered as overloading
    public static int sum (int a , int b) {
        return a + b;
    }

    public static float sum (float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        System.out.println("Sum of integers: " + sum(5, 10));
        System.out.println("Sum of floats: " + sum(5.5f, 10.5f));
    }
    
}
