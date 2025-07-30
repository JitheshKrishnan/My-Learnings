package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_and_iterator {
    public static void main(String a[]){
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(13);
        nums.add(90);
        nums.add(15);
        nums.add(77);

        System.out.println(nums);

        for(int n : nums){
            System.out.println(n);
        }

        Set<Integer> nums1 = new TreeSet<Integer>();
        nums1.add(13);
        nums1.add(98);
        nums1.add(15);
        nums1.add(72);

        System.out.println(nums1);

        for(int n : nums1){
            System.out.println(n);
        }

        Iterator<Integer> values = nums.iterator();
        
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
