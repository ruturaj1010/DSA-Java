public class DiagonalSum {

    public static void printSum(int arr[][]) {

        int sRow = 0, eRow = arr.length-1 , eCol = arr[0].length-1;

        int priSum = 0;
        int secSum = 0;

        for(int i = sRow; i <= eRow; i++) {
            priSum += arr[i][i];
            secSum += arr[i][eCol-i];
        }

        if (eCol % 2 == 1) {
            secSum -= arr[eCol / 2][eCol / 2];
        }

        System.out.println("Sum of diagonals primary : " + priSum + " secondary : " + secSum);
    }
    public static void main(String[] args) {
        int arr[][] = { {1,  2 , 3 , 4 },
                        {5,  6 , 7 , 8 },
                        {9,  10, 11, 12 },
                        {13, 14, 15, 16 }
                    };

        printSum(arr);
    }
}
