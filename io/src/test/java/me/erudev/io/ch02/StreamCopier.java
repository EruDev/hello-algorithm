package me.erudev.io.ch02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author pengfei.zhao
 * @date 2020/12/27 14:20
 */
public class StreamCopier {
    public static void main(String[] args) {
        try {
            copy(System.in, System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        while (true) {
            int bytesRead = in.read(buffer);
            if (bytesRead == -1) {
                break;
            }
            out.write(buffer, 0, bytesRead);
        }
    }
}
