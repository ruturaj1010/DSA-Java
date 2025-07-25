public class spiralMatrix {
    public static void printMatrixspriral(int matrix[][]) {
        int sRow = 0, eRow = matrix.length-1, sCol = 0, eCol = matrix[0].length-1;

        while (sRow <= eRow && sCol <= eCol) {
            // top part of matrix
            for (int i = sCol ; i <= eCol; i++ ) {
                System.out.print(matrix[sRow][i]+"  ");
            }
            System.out.println();

            // right part of matrix
            for(int i = sRow+1; i<= eRow; i++) {
                System.out.print(matrix[i][eCol]+"  ");
            }
            System.out.println();

            // bottom part of matrix
            for (int i = eCol-1 ; i >= sCol; i-- ) {
                if(sRow == eRow) {
                    break;
                }
                System.out.print(matrix[eRow][i]+"  ");
            }
            System.out.println();

            // left part of matrix
            for(int i = eRow-1 ; i > sRow ; i--) {
                if(sCol == eCol) {
                    break;
                }
                System.out.print(matrix[i][sCol]+"  ");
            }

            sRow++;
            eRow--;
            sCol++;
            eCol--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {  {1,  2 , 3 , 4 },
                            {5,  6 , 7 , 8 },
                            {9,  10, 11, 12 },
                            {13, 14, 15, 16 }
                         };

        printMatrixspriral(matrix);
    }
}
