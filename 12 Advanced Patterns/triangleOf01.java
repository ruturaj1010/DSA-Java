public class triangleOf01 {
    public static void trianglepyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trianglepyramid(5);
    }
}
