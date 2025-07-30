package LeetCode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode root = null;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    public TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else if (root.val > value) {
            root.left = insertRec(root.left, value);
        } else if (root.val < value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inorder(int[] nums, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            insert(nums[mid]);
            inorder(nums, left, mid - 1);
            inorder(nums, mid + 1, right);
        }
    }

}

public class SortedArrayToBST_108 {
    public static void main(String a[]) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6 };
        TreeNode node = sortedArrayToBST(nums);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        BinarySearchTree bst = new BinarySearchTree();

        bst.inorder(nums, l, r);

        return bst.root;
    }
}
