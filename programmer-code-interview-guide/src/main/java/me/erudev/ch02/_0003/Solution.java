package me.erudev.ch02._0003;

/**
 * 0003. 删除链表的中间节点和a/b处的节点
 *
 * @author pengfei.zhao
 * @date 2020/12/6 12:59
 */
public class Solution {

    static class Node {
        private int value;

        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node removeMidNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        if (head.next.next == null) {
            return head.next;
        }

        Node pre = head;
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
