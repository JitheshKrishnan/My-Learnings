package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection_interface {
    public static void main(String a[]) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(9);
        nums.add(15);
        nums.add(7);

        System.out.println(nums);

        for (int n : nums) {
            System.out.println(n);
        }

        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(3);
        nums1.add(9);
        nums1.add(15);
        nums1.add(7);

        System.out.println("Value: " + nums1.get(2));
        System.out.println("Index: " + nums1.indexOf(9));
    }
}
