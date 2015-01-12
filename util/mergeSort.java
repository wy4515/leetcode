import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        int[] res = new int[array.length];  // need a new array. because the old one is used to provide elements
        subroutine(array, res, 0, array.length);
    }
    public static void subroutine (int[] arr, int[] tmp, int l, int r) {
        if (l<r-1) {
            int mid = (l + r) / 2;
            subroutine(arr, tmp, l, mid);
            subroutine(arr, tmp, mid, r);
            merge(arr, tmp, l, mid, r);
        }
    }
    public static void merge(int[] arr, int[] tmp, int l, int m, int r) {
        int i,j, index;
        for (i=l, j=m, index=l; i<m && j<r; index++) {
            if (arr[i]<arr[j]) {
                tmp[index] = arr[i++];
            }
            else
                tmp[index] = arr[j++];
        }
        while (i<m)
            tmp[index++] = arr[i++];
        while (j<r)
            tmp[index++] = arr[j++];

        System.arraycopy(tmp,l,arr,l,r-l); // update sub-array!
    }
    public static void main(String[] args)
    {
        int[] a = {2, 3, 2, 1};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
}