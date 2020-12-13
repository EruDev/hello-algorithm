package me.erudev.ch05._0005;

/**
 * 字符串的统计字符串
 * [题目]
 * 给定一个字符串str, 返回 str 的统计字符串. 例如 "aaabbadddfc" 的统计字符串为 "a_3_b_2_a_1_d_3_f_1_c_1"
 *
 * @author pengfei.zhao
 * @date 2020/12/13 15:17
 */
public class Solution {

    public static void main(String[] args) {
        String str = "aaabbadddfc";
        String res = getCountString(str);
        System.out.println(res);
    }

    public static String getCountString(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        char[] chars = str.toCharArray();
        String result = String.valueOf(chars[0]);
        int num = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                result = concat(result, String.valueOf(num), String.valueOf(chars[i]));
                num = 1;
            } else {
                num++;
            }
        }
        return concat(result, String.valueOf(num), "");
    }

    private static String concat(String s1, String s2, String s3) {
        return s1 + "_" + s2 + (s3.equals("")? s3: "_" +s3);
    }
}
