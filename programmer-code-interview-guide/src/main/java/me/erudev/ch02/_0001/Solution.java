package me.erudev.ch02._0001;

/**
 * 0001. 打印两个有序链表的公共部分
 *
 * @author pengfei.zhao
 * @date 2020/12/6 12:11
 */

public class Solution {

    static class Node {
        public int value;

        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static void printCommonPart(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            } else if (head1.value > head2.value) {
                head2 = head2.next;
            } else {
                System.out.println(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);

        Node node2 = new Node(2);
        node2.next = new Node(3);
        node2.next.next = new Node(4);

        printCommonPart(node1, node2);
    }
}
