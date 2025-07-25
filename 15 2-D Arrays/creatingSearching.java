import java.util.Scanner;

public class creatingSearching {

    public static void searchKey(int matrix[][], int key) {
        for( int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if( matrix[i][j] == key) {
                    System.out.println("Key found at position: [" + i +"][" + j + "]" );
                    return;
                }
            }
        }
        System.out.println("Key not found in the matrix.");
    }

    public static void printMatrix(int matrix[][]) {
        for(int i = 0; i <matrix.length; i++) {
            for (int j =0 ; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int matrix[][] = new int[3][3];

        for (int i = 0 ; i < matrix.length; i++) {
            for(int j =0; j < matrix[0].length; j++) {
                matrix[i][j] =sc.nextInt();
            }
        }

        searchKey(matrix, 5);
        printMatrix(matrix);

        sc.close();
    }
}
