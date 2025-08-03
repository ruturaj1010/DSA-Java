public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student("Ruturaj", 39);
        s1.password = "abcde";
        System.out.println(s1.password);

        Student s2 = new Student(s1);
        s2.password ="xyzwes";
        System.out.println(s2.password);
    }
}

class Student {
    String name;
    int rollNo;
    String password;

    Student (String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    Student (Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }
}