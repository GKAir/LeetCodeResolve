package com.problem.resolve;

/**
 * Created by zhangweizhou
 * Email: zhangweizhou@wanhuchina.com
 * Date:  2017/11/10
 * Time:  17:29
 */
public class PalindromeNumber {

    public static void main(String[] args) {


    }

    public static boolean palindromeNumber(int x) {

        if (x >= Integer.MAX_VALUE || x <= 0) {
            return false;
        } else {
            String reverse = "";
            String str = x + "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            System.out.println(reverse);
            if (str.equals(reverse)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
