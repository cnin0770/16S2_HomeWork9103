package comp9103.cnin0770;

/**
 * Created by cnin0770 on 19/10/16.
 */
public class W12_Merge_Sort_Recursive {
    private static String key = "7,6,7,6,4,5,4,7,6,8,9,6,6,4,5,3,5,6,8,7,8";

    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    public static int[] setup (int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        merge_sort_recursive(arr, result, 0, len - 1);
        return result;
    }

    public static void main(String[] args) {
        String[] arr = key.split(",");

//        for (String k : arr) {
//            System.out.print(k);
//        }

        int[] intArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            try {
                intArr[i] = Integer.parseInt(arr[i]);
                System.out.print(intArr[i]);
            } catch (Exception e) {
                e.getMessage();
            }
        }

        System.out.println(setup(intArr));
    }
}
