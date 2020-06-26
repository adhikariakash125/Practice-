package Random;

import java.util.*;

class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        if (digits.length == 1 && digits[0] >= 10)
            return utils(digits);

        if (digits.length == 1)
            return digits;

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] >= 10) {
                carry = digits[i] / 10;
                digits[i] = digits[i] % 10;
                digits[i - 1] = digits[i - 1] + carry;
            }
        }
        if (digits[0] >= 10) {
            return utils(digits);
        }
        return digits;
    }

    public static int[] utils(int[] digits) {
        int[] x = new int[digits.length + 1];
        x[0] = digits[0] / 10;
        x[1] = digits[0] % 10;
        int j = 2;
        for (int i = 1; i < digits.length; i++)
            x[j++] = digits[i];
        return x;
    }

//    private int[] h() {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        return list.toArray(new int[3]);
//    }

}