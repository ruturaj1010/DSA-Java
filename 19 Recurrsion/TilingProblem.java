public class TilingProblem {
    public static int waysToTiles(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = waysToTiles(n - 1);

        int horizontal = waysToTiles(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        System.out.println(waysToTiles(3));
    }
}
