package com.problem.resolve;

/**
 * Created by zhangweizhou
 * Email: zhangweizhou@wanhuchina.com
 * Date:  2017/11/10
 * Time:  16:47
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int x = -2147483648;
        int i = reveerseInteger(x);
        System.out.println(i);
    }

    public static int reveerseInteger(int x) {
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return 0;
        }
        String str = "";
        if (x >= 0) {
            String temp = x + "";
            for (int i = temp.length() - 1; i >= 0; i--) {
                str += temp.charAt(i);
            }
        } else {
            String temp = -x + "";
            for (int i = temp.length() - 1; i >= 0; i--) {
                str += temp.charAt(i);
            }
            if (Long.parseLong(str) >= Integer.MAX_VALUE) {
                return 0;
            }
            return -Integer.valueOf(str);
        }
        if (Long.parseLong(str) >= Integer.MAX_VALUE) {
            return 0;
        }
        return Integer.parseInt(str);
    }
}
