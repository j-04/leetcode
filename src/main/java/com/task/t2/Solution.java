package com.task.t2;

import java.math.BigInteger;

// Add Two Numbers
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int buf = 0;
        ListNode resultNode = new ListNode();
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = resultNode;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                buf += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                buf += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(buf % 10);
            p3 = p3.next;
            buf /= 10;
        }
        if (buf == 1) {
            p3.next = new ListNode(1);
        }
        return resultNode.next;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}