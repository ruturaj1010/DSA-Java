public class FirstOccurrence {
    public static void firstOccOfElement(int arr[], int i, int key) {
        if (i == arr.length) {
            System.out.println("Element Not found");
            return;
        }

        if (arr[i] == key) {
            System.out.println("Element occurs first at index : " + i);
            return;
        }
        firstOccOfElement(arr, i + 1, key);
    }

    public static void lastOccOfElement(int arr[], int i, int key) {
        if (i == -1) {
            System.out.println("Element not found");
            return;
        }

        if (arr[i] == key) {
            System.out.println("last occurence at : " + i);
            return;
        }

        lastOccOfElement(arr, i - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 45, 23, 45, 7, 8 };

        firstOccOfElement(arr, 0, 45);

        lastOccOfElement(arr, arr.length - 1, 45);
    }
}
