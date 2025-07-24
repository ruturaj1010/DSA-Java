public class invertedHalfPyramid {
    public static void halfPyramid(int row) {
        for(int i = 0; i < row; i++) {
            for(int j = 1; j <= row-i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPyramid(5);
    }
}
