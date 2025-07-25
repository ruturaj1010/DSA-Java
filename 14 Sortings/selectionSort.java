public class selectionSort {

    public static void selectionSorting(int arr[]) {
        for (int i=0;  i <arr.length -1; i++) {
            int minPos = i;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // swapping
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8, 3 };
        selectionSorting(arr);
        printArray(arr);
    }
}
