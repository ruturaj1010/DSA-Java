public class OopsBasics {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setSize(6);
        System.out.println(p1.size);
    }
}

class Pen {
    String color;
    int size;

    void setColor(String color) {
        this.color = color;
    }

    void setSize(int size) {
        this.size =  size;
    }
}
