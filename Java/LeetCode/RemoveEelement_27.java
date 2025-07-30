package LeetCode;

public class RemoveEelement_27 {
    public static void main(String a[]) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 2;
        int k = removeElement(nums, val);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}