package me.erudev.ch05._0001;

/**
 * 判断两个字符串是否互为变形词
 *
 * @author pengfei.zhao
 * @date 2020/12/9 21:14
 */
public class Solution {

    public static boolean isInflection(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[] map = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            map[chars1[i]]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map[chars2[i]]-- == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "aabc";
        String s2 = "abca";
        System.out.println("s1 和 s2 互为变形词: " + isInflection(s1, s2));
    }
}
