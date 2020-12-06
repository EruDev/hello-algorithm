package me.erudev.ch02._0002;

/**
 * 0002. 在单链表和双链表中删除倒数第K个节点
 *
 * @author pengfei.zhao
 * @date 2020/12/6 12:23
 */
public class Solution {
    /**
     * 单链表
     */
    static class Node {
        public int value;

        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node removeLastKthNode(Node head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }

        Node cur = head;
        while (head != null) {
            lastKth--;
            head = head.next;
        }

        if (lastKth == 0) {
            head = head.next;
        }
        if (lastKth < 0) {
            cur = head;
            while (lastKth++ != 0) {
                cur = head.next;
            }
            cur.next = cur.next.next;
        }

        return head;
    }

    /**
     * 双链表
     */
    static class DoubleNode {
        public int value;

        public DoubleNode last;

        public DoubleNode next;

        public DoubleNode(int data) {
            this.value = data;
        }
    }

    public static DoubleNode removeLastKthNode(DoubleNode head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }
        DoubleNode cur = head;

        while (head != null) {
            lastKth--;
            head = head.next;
        }

        if (lastKth == 0) {
            head = head.next;
            head.last = null;
        }

        if (lastKth < 0) {
            cur = head;
            while (lastKth++ != 0) {
                cur = cur.next;
            }
            DoubleNode newNext = cur.next.next;
            cur.next = newNext;
            if (newNext != null) {
                newNext.last = cur;
            }
        }
        return head;
    }
}
