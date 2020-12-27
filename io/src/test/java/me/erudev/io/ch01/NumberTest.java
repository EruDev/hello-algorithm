package me.erudev.io.ch01;

import org.junit.Test;

/**
 * @author pengfei.zhao
 * @date 2020/12/27 12:38
 */
public class NumberTest {

    @Test
    public void byteTest() {
        // 只能向下转型
        int i = 42;
        //byte b = i; 编译不通过
        long l = 100L;

    }
}
