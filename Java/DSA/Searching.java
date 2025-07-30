package DSA;

public class Searching {
    public static void main(String a[]){
        int nums[] = {3,5,8,11,15,19};
        int target = 19;

        int result1 = LinearSearch(nums, target);
        int result2 = BinarySearch(nums, target);
        int result3 = BinarySearchRecursion(nums, target, 0, nums.length-1);
        if(result1==-1||result2==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + result3);
        }
    }
    public static int LinearSearch(int[] nums, int target){
        int steps=0;
        for(int i = 0; i < nums.length; i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps Linear: "+steps);
                return i;
            }
        }
        System.out.println("Steps Linear: "+steps);
        return -1;
    }
    public static int BinarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int steps=0;

        while(start<=end){
            steps++;
            int mid = (start+end)/2;
            if(nums[mid]==target){
                System.out.println("Steps Binary: "+steps);
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("Steps Binary: "+steps);
        return -1;
    }
    public static int BinarySearchRecursion(int[] nums, int target, int start, int end){
        int mid = (start+end)/2;
        if(start<=end){
            if(nums[mid]==target)
                return mid;
            else if(nums[mid] < target)
                return BinarySearchRecursion(nums, target, mid+1, end);
            else
                return BinarySearchRecursion(nums, target, start, mid-1);
        }
        return -1;
    }
}
