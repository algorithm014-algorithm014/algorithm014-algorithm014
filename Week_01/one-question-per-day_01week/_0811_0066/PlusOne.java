package _2020._08._11._0066;

import java.util.Arrays;

/**
 * 66. 加一
 * ----------------------------
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * ----------------------------
 * https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {


    static public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (9 != digits[i]) {//当前数字不为9则加1，并返回结果。
                digits[i] += 1;
                return digits;
            } else {//当前数字为9则置为0
                digits[i] = 0;
            }
        }
        if (0 == digits[0]) {//最高位为0，则新生成长度大1数组，最高位置为1，则返回。
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }

    public static void main(String args[]) {
        int[] digits = {9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
