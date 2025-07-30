package Practice;

class SearchingAlgorithms {
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }

    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else if (arr[mid] > target)
                right = mid - 1;
        }
        System.out.println("Element not found!");
        return -1;
    }

    public int binarySearchRecursion(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                return binarySearchRecursion(arr, target, mid + 1, right);
            else if (arr[mid] > target)
                return binarySearchRecursion(arr, target, left, mid - 1);
        }
        System.out.println("Element not found!");
        return -1;
    }
}

public class Searching {
    public static void main(String a[]) {
        SearchingAlgorithms nums = new SearchingAlgorithms();
        int[] arr = { 3, 4, 5, 8, 9, 12 };
        System.out.println("Linear Search:");
        if (nums.linearSearch(arr, 7) != -1)
            System.out.println("Element found at index: " + nums.linearSearch(arr, 7));
        System.out.println();
        System.out.println("Binary Search: ");
        if (nums.binarySearch(arr, 7) != -1)
            System.out.println("Element found at index: " + nums.binarySearch(arr, 7));
        System.out.println();
        System.out.println("Binary Search: ");
        if (nums.binarySearchRecursion(arr, 12, 0, arr.length - 1) != -1)
            System.out.println("Element found at index: " + nums.binarySearchRecursion(arr, 12, 0, arr.length - 1));
    }
}
