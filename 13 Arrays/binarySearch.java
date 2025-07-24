public class binarySearch {

    public static int searchBinary(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                System.out.println("Element found at index: " + mid);
                return mid;
            }

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40, 54, 67, 82 };
        int x = 67;

        if (searchBinary(arr, x) == -1) {
            System.out.println("Element not found in the array.");
        }
    }
}
