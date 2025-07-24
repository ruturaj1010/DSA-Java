public class linearSearch {

    public static void searchLinearly(int arr[], int x) {
        for(int i= 0; i<arr.length; i++) {
            if(arr[i]==x) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
    }

    public static void largestElement(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element in the array is: " + largest);
    }

    public static void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};

        searchLinearly(arr, 10 );

        largestElement(arr);
    }
}