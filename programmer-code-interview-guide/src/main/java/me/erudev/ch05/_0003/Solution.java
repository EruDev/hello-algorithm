package me.erudev.ch05._0003;

/**
 * 将整数字符串转成整数值
 *
 * @author pengfei.zhao
 * @date 2020/12/12 14:39
 */
public class Solution {
    public static boolean isValid(char[] chars) {
        if (chars[0] != '-' && (chars[0] < '0' || chars[0] > '9')) {
            return false;
        }
        if (chars[0] == '-' && (chars.length == 1 || chars[1] == '0')) {
            return false;
        }
        if (chars[0] == '0' && chars.length > 1) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
