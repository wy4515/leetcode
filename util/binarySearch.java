public class BinarySearch {
    /*
        binary search only for sorted array
     */
    private static int bSearch (int key, int[] array) {
        int l = 0, r = array.length-1;  // boundary issue!
        while (l<=r) {
            int mid = (l + r)/2;
            if (key > array[mid])
                l = mid+1;
            else if (key < array[mid])
                r = mid-1;
            else
                return mid;
        }
        return -1;
    }
}
