package me.erudev.ch01._0003;

import java.util.Arrays;
import java.util.Stack;

/**
 * 如何仅用递归函数和栈逆序一个栈
 *
 * @author pengfei.zhao
 * @date 2020/12/5 16:14
 */
public class RecursionStack {


    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        } else {
            int lastElement = getAndRemoveLastElement(stack);
            stack.push(result);
            return lastElement;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(Arrays.toString(stack.toArray()));

        int last = getAndRemoveLastElement(stack);
        System.out.println(last);
        int last2 = getAndRemoveLastElement(stack);
        System.out.println(last2);
        int last3 = getAndRemoveLastElement(stack);
        System.out.println(last3);
    }
}
