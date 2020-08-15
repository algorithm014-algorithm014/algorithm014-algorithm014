package _2020._08._10._0070;

/**
 * 70. 爬楼梯
 * ----------------------------
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * ----------------------------
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbStairs {


    static public int climbStairs(int n) {
        if(n < 3)return n;
        int s3 = 0, s2 = 2, s1 = 1;
        for (int i = 3; i <= n; i++) {
            s3 = s2 + s1;
            s1 = s2;
            s2 = s3;
        }
        return s3;
    }

    public static void main(String args[]) {
        System.out.println(climbStairs(4));
    }
}
