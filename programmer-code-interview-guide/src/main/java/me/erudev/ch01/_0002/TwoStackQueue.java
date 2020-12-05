package me.erudev.ch01._0002;

import java.util.Stack;

/**
 * 由两个栈组成的队列 支持队列的基本操作(add、poll、peek)
 * 1. 队列先进先出
 *
 * @author pengfei.zhao
 * @date 2020/12/5 15:38
 */
public class TwoStackQueue {
    private Stack<Integer> stackPush;

    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    /**
     * 添加一个item
     * @param val 值
     */
    public void add(int val) {
        stackPush.add(val);

    }

    /**
     * 检索并删除此队列开头的item
     * 必须保证 reverseStack 为空, 才能往里边添加item
     * @return val
     */
    public Integer poll() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    /**
     * 检索并返回此队列开头的item
     * 必须保证 reverseStack 为空, 才能往里边添加item
     * @return val
     */
    public Integer peek() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
