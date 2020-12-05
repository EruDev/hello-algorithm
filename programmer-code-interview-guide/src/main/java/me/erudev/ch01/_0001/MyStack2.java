package me.erudev.ch01._0001;

import java.util.Stack;

/**
 * 设计一个具有gitMin功能的栈(last-in-first-out LIFO)
 * 1. stackData 存储压入的元素, stackMin 只存储压入进来比之前小的元素
 * 2. getMin 返回 stackMin 栈顶元素
 *
 * @author pengfei.zhao
 * @date 2020/12/5 15:20
 */
public class MyStack2 {

    private Stack<Integer> stackData;

    private Stack<Integer> stackMin;

    public MyStack2() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int val) {
        if (stackMin.isEmpty()) {
            stackMin.push(val);
        } else if (val <= getMin()) {
            stackMin.push(val);
        } else {
            // 先拿到 stackMin 中上一个更小的item, 再重新压入
            int minVal = stackMin.peek();
            stackMin.push(minVal);
        }
        stackData.push(val);
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        Integer value = stackData.pop();
        if (value == getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Min stack is empty!");
        }
        return stackMin.peek();
    }
}
