import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQue {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student (String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student S2) {
            return this.rank - S2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pa = new PriorityQueue<>(Comparator.reverseOrder());
        pa.add(3);
        pa.add(7);
        pa.add(1);
        pa.add(4);

        while (!pa.isEmpty()) {
            System.out.print(pa.peek() + " ");
            pa.remove();
        }
        System.out.println();


        PriorityQueue<Student> pb = new PriorityQueue<>();
        pb.add(new Student("Prathmesh", 25));
        pb.add(new Student("Yash", 17));
        pb.add(new Student("Utkarsh", 9));
        pb.add(new Student("Priyanka", 23));

        while (!pb.isEmpty()) {
            System.out.print(pb.peek().name + " " + pb.peek().rank + " -> ");
            pb.remove();
        }
    }
}