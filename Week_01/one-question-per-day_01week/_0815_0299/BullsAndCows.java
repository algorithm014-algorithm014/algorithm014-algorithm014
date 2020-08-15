package _2020._08._15._0299;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 299. 猜数字游戏
 * ----------------------------
 * 你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：
 * <p>
 * 你写出一个秘密数字，并请朋友猜这个数字是多少。
 * 朋友每猜测一次，你就会给他一个提示，告诉他的猜测数字中有多少位属于数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位属于数字猜对了但是位置不对（称为“Cows”, 奶牛）。
 * 朋友根据提示继续猜，直到猜出秘密数字。
 * 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，返回字符串的格式为 xAyB ，x 和 y 都是数字，A 表示公牛，用 B 表示奶牛。
 * <p>
 * xA 表示有 x 位数字出现在秘密数字中，且位置都与秘密数字一致。
 * yB 表示有 y 位数字出现在秘密数字中，但位置与秘密数字不一致。
 * 请注意秘密数字和朋友的猜测数都可能含有重复数字，每位数字只能统计一次。
 * ------------------------------------------------------------------
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bulls-and-cows
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BullsAndCows {

    //将数值放入Set中：发生错误，需要考虑【请注意秘密数字和朋友的猜测数都可能含有重复数字，每位数字只能统计一次】
//    输入："1122"   "2211"
//    输出："0A2B"
//    预期："0A4B"
//    static public String getHint(String secret, String guess) {
//        String result = "";
//        int bullsCount = 0;//公牛数量
//        int cowsCount = 0;//母牛数量
//        Set<Character> secretSet = new HashSet<>();
//        for (int i = 0; i < secret.length(); i++) {
//            secretSet.add(secret.charAt(i));
//        }
//        for (int i = 0; i < guess.length(); i++) {
//            char guessChar = guess.charAt(i);
//            if (secret.charAt(i) == guessChar) {
//                bullsCount++;
//            } else if (secretSet.contains(guessChar)) {
//                cowsCount++;
//                secretSet.remove(guessChar);//母牛统计过一次，则移除该字符。
//            }
//        }
//        return result + bullsCount + "A" + cowsCount + "B";
//    }
    //Map：key记录字符，value记录数值的数量.
    //    输入："1122"   "2211"
    //    输出："0A2B"
    //    预期："0A4B"
    //-----
    //    输入："1122"  "1222" 【优先统计公牛】
    //    输出："3A1B"
    //    预期："3A0B"
    static public String getHint(String secret, String guess) {
        String result = "";
        int bullsCount = 0;//公牛数量
        int cowsCount = 0;//母牛数量
        Map<Character, Integer> secretMap = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            char secretChar = secret.charAt(i);
            if (secretMap.containsKey(secretChar)) {
                secretMap.put(secretChar, secretMap.get(secretChar) + 1);
            } else {
                secretMap.put(secretChar, 1);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            char guessChar = guess.charAt(i);
            if (secret.charAt(i) == guessChar) {
                bullsCount++;
                secretMap.put(guessChar, secretMap.get(guessChar) - 1);//统计过一次，则减去.
            }
        }
        for(int i = 0; i < guess.length(); i++){
            char guessChar = guess.charAt(i);
              if (secret.charAt(i) != guessChar && secretMap.containsKey(guessChar) && secretMap.get(guessChar) > 0) {
                cowsCount++;
                secretMap.put(guessChar, secretMap.get(guessChar) - 1);//统计过一次，则减去.
            }
        }
        return result + bullsCount + "A" + cowsCount + "B";
    }

    public static void main(String args[]) {
        System.out.println(getHint("1122", "1222"));
    }
}
