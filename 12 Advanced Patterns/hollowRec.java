public class hollowRec {
    public static void hollowRect(int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == (row - 1) || j == 0 || j == (col-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        hollowRect(5, 6);
    }
}
