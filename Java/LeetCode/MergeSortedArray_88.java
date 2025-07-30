package LeetCode;

public class MergeSortedArray_88 {
    public static void main(String a[]) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int s : nums1) {
            System.out.print(s + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums3 = nums1;
        // int[] nums3=new int[m];
        // for(int x=0; x<m; x++){
        // nums3[x]=nums1[x];
        // }
        while (i < m && j < n) {
            if (nums3[i] <= nums2[j]) {
                nums1[k] = nums3[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            nums1[k] = nums3[i];
            i++;
            k++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}