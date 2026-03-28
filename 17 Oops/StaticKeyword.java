public class StaticKeyword {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.schoolName = "KEMS";


        Students s2 = new Students();
        System.out.println(s2.schoolName);
    }
}

class Students {
    String name;
    int rollNo;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
