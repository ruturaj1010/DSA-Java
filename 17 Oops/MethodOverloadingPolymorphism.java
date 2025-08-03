public class MethodOverloadingPolymorphism {
    // method overloading also known as compile time polymorphism done with different paraeters but having same method name.
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(5, 5));
        System.out.println(c1.sum((float)1.2, (float)1.8));
        System.out.println(c1.sum(23, 23));
    }
}

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}