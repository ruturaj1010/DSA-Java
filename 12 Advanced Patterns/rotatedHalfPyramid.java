public class rotatedHalfPyramid {

    public static void halfPyramid(int row) {
        for (int i = 0; i < row; i++) {
            // for (int j = row - 1; j > i; j--) {
            //     System.out.print("  ");
            // }
            for (int j = 0; j < row-i-1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        halfPyramid(5);
    }
}
