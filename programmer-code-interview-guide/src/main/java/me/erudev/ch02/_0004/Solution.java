package me.erudev.ch02._0004;

/**
 * 0004. 反转单链表
 * https://leetcode-cn.com/problems/reverse-linked-list/solution/dong-hua-yan-shi-206-fan-zhuan-lian-biao-by-user74/
 *
 * @author pengfei.zhao
 * @date 2020/12/6 13:34
 */
public class Solution {
    static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node reverseList(Node head) {
        // 申请节点, pre 和 cur, pre 指向 null
        Node pre = null;
        Node cur = head;
        Node tmp = null;

        while (cur != null) {
            // 记录当前节点的下一个节点
            tmp = cur.next;
            // 然后将当前节点指向 pre
            cur.next = pre;
            // pre 和 cur 节点都向前一位
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
