package me.erudev.io.ch02;

import org.junit.Test;

import java.io.IOException;

/**
 * @author pengfei.zhao
 * @date 2020/12/27 13:43
 */
public class AsciiChartTest {

    @Test
    public void asciiChartTest() {
        for (int i = 32; i < 127; i++) {
            System.out.write(i);
            if (i % 8 == 7)
                System.out.write('\n');
            else
                System.out.write('\t');
        }
        System.out.write('\n');
    }

    @Test
    public void asciiArrayTest() {
        byte[] b = new byte[(127 - 31) * 2];
        int index = 0;
        for (int i = 32; i < 127; i++) {
            b[index++] = (byte) i;
            if (i%8 == 7)
                b[index++] = (byte) '\n';
            else
                b[index++] = (byte) '\t';
        }
        try {
            System.out.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
