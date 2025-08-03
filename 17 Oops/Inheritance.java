public class Inheritance {
    // there are four types single level, multi-level, hybrid, heirarchical
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base / Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("I am eating.");
    }

    void breathe() {
        System.out.println("I am breathing.");
    }
}

// Derived or child class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("let`s swim.");
    }
}