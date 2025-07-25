public class searchInSortedMatrix {

    public static void sortedMatrixSearch(int matrix[][], int key) {
        int sRow = 0, eRow = matrix.length-1, sCol = 0, eCol = matrix[0].length-1;

        while (eCol >= sCol && eRow >= sRow) {
            if (key == matrix[sRow][eCol]) {
                System.out.println("Found at index [" + sRow + "][" + eCol + "] ");
                return;
            }
            if (key < matrix[sRow][eCol]) {
                eCol--;
            } else {
                sRow++;
            }
        }

        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int matrix[][] = {  {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}  };

        sortedMatrixSearch(matrix, 33 );
    }
}
