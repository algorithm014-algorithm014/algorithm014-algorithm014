package _2020._08._12._0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * ----------------------------
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * ----------------------------
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Sum4TwoNumbers {


    //[1]暴力解决
//    static public int[] twoSum(int[] nums, int target) {
//        int results[] = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    results[0] = i;
//                    results[1] = j;
//                    return results;
//                }
//            }
//        }
//        return results;
//    }

    //[2]方法二：两遍哈希表
//    static public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        //记录
//        for(int i =0; i < nums.length;i++){
//            numMap.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int temp = target - nums[i];
//            if (numMap.containsKey(temp) && numMap.get(temp) != i) {
//                return new int[]{i, numMap.get(temp)};
//            }
//        }
//        return null;
//    }


    //方法三：一遍哈希表，遍历退出条件，一定在遍历两个数字中的下标最大的那个时。
    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (numMap.containsKey(temp)) {
                return new int[] { numMap.get(temp), i };
            }
            numMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
