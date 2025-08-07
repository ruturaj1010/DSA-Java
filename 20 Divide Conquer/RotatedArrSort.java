public class RotatedArrSort {
    public static int SortedRotatedSearch(int arr[], int tar, int si, int ei) {
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        // mid on line L1
        if (arr[si] <= arr[mid]) {
            // target at left on L1
            if (arr[si] <= tar && tar <= arr[mid]) {
                return SortedRotatedSearch(arr, tar, si, mid - 1);
            // target at right of mid
            } else {
                return SortedRotatedSearch(arr, tar, mid + 1, ei);
            }

        // mid on line 2
        } else {
            // target at right on L2
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return SortedRotatedSearch(arr, tar, mid + 1, ei);
            // target at left of mid
            } else {
                return SortedRotatedSearch(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {  6, 7, 0, 1, 2, 3, 4, 5 };
        int tar = 0;
        int idx = SortedRotatedSearch(arr, tar, 0, arr.length - 1);
        System.out.println(idx);
    }
}
