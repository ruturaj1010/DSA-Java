public class GridWays {
    public static int calGridWays(int i, int j, int rows, int cols) {

        if(i == rows-1 && j == cols-1) {
            return 1;
        } else if (i == rows || j == cols) {
            return 0;
        }

        return calGridWays(i+1, j, rows, cols) + calGridWays(i, j+1, rows, cols);
    }
    public static void main( String args[]) {
        int rows = 3;
        int cols = 3;

        System.out.println(calGridWays(0, 0, rows, cols));
    }
}