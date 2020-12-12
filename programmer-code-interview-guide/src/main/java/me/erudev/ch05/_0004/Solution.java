package me.erudev.ch05._0004;

/**
 * 替换字符串中连续出现的指定字符串
 * <p>
 * 要求:
 * 1. 给定三个字符串 str, from, to, 要把 str 中所有的 from 替换成 to, 对于连续出现的部分只要求替换一个 to 字符串,
 * 返回最终的结果字符串
 * ex: str="123abc", from="abc", to="456". result="123456";
 * str="123", from="abc", to="456". result="123";
 * str="123abcabc", from="abc", to="456". result="123456";
 *
 * @author pengfei.zhao
 * @date 2020/12/12 14:59
 */
public class Solution {

    public static String replace(String str, String from, String to) {
        if (!str.contains(from)) {
            return str;
        }
        int fromIdx = str.indexOf(from);
        int endIdx = fromIdx+from.length()-1+from.length()-1;
        if (endIdx > str.length()) {
            return str.replace(from, to);
        } else {
            str.substring(fromIdx+from.length()-1, fromIdx+from.length()-1+from.length()-1);
        }
        return null;
    }

    public static void main(String[] args) {
        replace("123abc", "abc", "456");
    }
}
