public class AbstractionBasics {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        
        Chicken c1 = new Chicken();
        c1.changeColor();
        System.out.println(c1.color);
        c1.eat();
        c1.walk();
    }
}

// we cannot create objects of abstract classes
abstract class Animal {
    String color;

    Animal () {
        color = "Brown";
    }

    void eat(){
        System.out.println("Animal Eat");
    };

    abstract void walk();
}

class Horse extends Animal {
    void changeColor(){
        color = "Peach";
    }
    void walk() {
        System.out.println("walking on four legs.");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "White";
    }
    void walk() {
        System.out.println("Walks on two legs.");
    }
}