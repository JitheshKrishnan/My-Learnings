package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II_119 {
    public static void main(String a[]) {
        int rowIndex = 7;
        List<Integer> result = getRow(rowIndex);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> innerList = new ArrayList<>();
            // innerList.add(1);
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    innerList.add(1);
                    continue;
                }
                innerList.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
            }
            list.add(innerList);
        }
        return list.get(rowIndex);
    }
}