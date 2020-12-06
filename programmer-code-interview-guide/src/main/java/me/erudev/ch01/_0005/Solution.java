package me.erudev.ch01._0005;

import java.util.Arrays;
import java.util.Stack;

/**
 * 用一个栈对另一个栈排序
 *
 * @author pengfei.zhao
 * @date 2020/12/6 10:14
 */
public class Solution {

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();

        while (!stack.empty()) {
            Integer cur = stack.pop();
            while (!help.empty() && cur < help.peek()) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.empty()) {
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(2);
        System.out.println(Arrays.toString(stack.toArray()));

        sortStackByStack(stack);

        System.out.println(Arrays.toString(stack.toArray()));
    }
}
