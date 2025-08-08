public class NQueensOneSol {

    public static boolean NQueensPlace(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return true;
        }

        // work
        for (int j = 0; j < board[0].length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if ( NQueensPlace(board, row + 1)){
                    return true;
                }
                board[row][j] = '.';
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // for vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // for left diagonally up
        int i = row - 1, j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        // for right diagnolly up
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < board[0].length) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if(NQueensPlace(board, 0)){
            System.out.println("There is possible solution");
        }else {
            System.out.println("There`s no any possible solution.");
        }

    }
}
