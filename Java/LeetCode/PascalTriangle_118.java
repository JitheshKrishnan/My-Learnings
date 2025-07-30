package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {

    public static void main(String a[]) {
        int numRows = 5;
        List<List<Integer>> outp = generate(numRows);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.get(i).add(j, 1);
                } else {
                    list.get(i).add(j, list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
                }
            }
        }
        return list;
    }
}