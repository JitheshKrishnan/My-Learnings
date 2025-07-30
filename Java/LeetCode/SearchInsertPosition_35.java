package LeetCode;

public class SearchInsertPosition_35 {
    public static void main(String[] a) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int index = searchInsert(nums, target);
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        if (nums[left] > target) {
            return left;
        } else if (nums[left] < target) {
            return left + 1;
        }
        return left;
    }
}
