package LeetCode;

public class RemoveDuplicates_26 {
    public static void main(String a[]) {
        int[] nums = { 1, 1, 2, 2, 3, 5, 5, 10 };
        int[] kArr = removeDuplicates(nums);
        System.out.println("Length: " + kArr.length);
        System.out.println("Array: ");
        for (int n : kArr) {
            System.out.println(n);
        }
    }

    public static int[] removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int[] resultArray = new int[nums.length];
        resultArray[0] = nums[0];
        while (i < nums.length) {
            if (nums[i] != nums[i - 1]) {
                resultArray[j] = nums[i];
                j++;
                i++;
            } else {
                i++;
            }
        }
        int[] finalArr = new int[j];
        for (int x = 0; x < j; x++) {
            finalArr[x] = resultArray[x];
        }
        return finalArr;
    }
}