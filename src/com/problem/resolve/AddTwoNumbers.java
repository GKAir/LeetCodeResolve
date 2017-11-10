package com.problem.resolve;

import java.util.LinkedList;

/**
 * Created by zhangweizhou
 * Email: zhangweizhou@wanhuchina.com
 * Date:  2017/11/10
 * Time:  14:33
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l11.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l21.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;
        ListNode listNode = addTwoNumbers(l11, l21);
        System.out.println(listNode);

    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = new ListNode((l1.val + l2.next.next.val) >= 10 ? (l1.val + l2.next.next.val) % 10 : (l1.val + l2.next.next.val));
        if ((l1.next.val + l2.next.val) >= 10) {
            temp1.val += 1;
        }
        ListNode temp2 = new ListNode((l1.next.val + l2.next.val) >= 10 ? (l1.next.val + l2.next.val) % 10 : (l1.next.val + l2.next.val));
        temp1.next = temp2;
        if ((l1.next.next.val + l2.val) >= 10) {
            temp2.val += 1;
        }
        ListNode temp3 = new ListNode((l1.next.next.val + l2.val) >= 10 ? (l1.next.next.val + l2.val) % 10 : (l1.next.next.val + l2.val));
        temp2.next = temp3;
        return temp1;
    }
}
