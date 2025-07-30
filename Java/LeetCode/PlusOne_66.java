package LeetCode;

public class PlusOne_66 {
    public static void main(String a[]) {
    }

    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int i = 0;
        while (true) {
            int unit = (digits[size - 1 - i] + 1) % 10;
            int carry = (digits[size - 1 - i] + 1) / 10;

            if (carry == 0) {
                digits[size - 1 - i] = unit;
                return digits;
            }

            if (size - 1 - i != 0) {
                digits[size - 1 - i] = unit;
                i++;
            } else {
                int[] newArr = new int[size + 1];
                newArr[0] = 1;
                for (int j = 1; j < newArr.length; j++) {
                    newArr[j] = 0;
                }
                return newArr;
            }
        }
    }
}