package me.erudev.ch05._0002;

/**
 * @author pengfei.zhao
 * @date 2020/12/12 8:409
 */
public class Solution {
    private static final String nums = "0123456789";

    public static int sumSubStr(String str) {
        if (str == null) {
            return 0;
        }
        char[] charArr = str.toCharArray();
        int res = 0;
        int num = 0;
        int cur = 0;
        boolean pos = true;
        for (int i = 0; i < charArr.length; i++) {
            cur = charArr[i] - '0';
            if (cur < 0 || cur > 9) {
                res += num;
                num = 0;
                if (charArr[i] == '-') {
                    if (i - 1 > -1 && charArr[i - 1] == '-') {
                        pos = !pos;
                    } else {
                        pos = false;
                    }
                } else {
                    pos = true;
                }
            } else {
                num = num * 10 + (pos ? cur : -cur);
            }
        }
        res += num;
        return res;
    }

    public static void main(String[] args) {
        String s1 = "A1CD2E33";
        String s2 = "A-1B--2C--D6E";
        int res = sumSubStr(s1);
        System.out.println(res);
    }
}
