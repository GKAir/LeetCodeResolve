package com.problem.resolve;

/**
 * Created by zhangweizhou
 * Email: zhangweizhou@wanhuchina.com
 * Date:  2017/11/10
 * Time:  15:35
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "babad";
        int i = lengthOfLongestSubstring(s);
        /*System.out.println(System.nanoTime());
        System.out.println(i);
        System.out.println(System.nanoTime());*/
    }

    public static int lengthOfLongestSubstring(String s) {

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!sb.toString().contains(c + "")) {
                sb.append(c);
                index = index > sb.length() ? index : sb.length();
                System.out.println(sb);
            } else {
                sb.delete(0, sb.toString().indexOf(c) + 1);
                sb.append(c + "");
            }
        }
        return sb.length();
    }
}
