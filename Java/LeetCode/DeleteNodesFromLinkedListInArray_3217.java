//! Topics: Array, Hash Table, Linked List

//? Medium Difficulty

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    // Default constructors
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode(int[] values) {
        if (values == null || values.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        this.val = values[0]; // set head value
        ListNode current = this;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head)     {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) 
        {
            if (numSet.contains(curr.next.val)) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return dummy.next;
    }
}

public class DeleteNodesFromLinkedListInArray_3217 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,3};
        ListNode head = new ListNode(new int[] {1,2,1,2,1,2});
        ListNode result = sol.modifiedList(nums, head);
        System.out.println(result);
    }
}