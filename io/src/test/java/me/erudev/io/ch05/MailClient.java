package me.erudev.io.ch05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author pengfei.zhao
 * @date 2020/12/28 19:30
 */
public class MailClient {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java MailClient username@host.com");
            return;
        }
        try {
            URL url = new URL("mailto:" + args[0]);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            for (int c = System.in.read(); c != -1; c = System.in.read()) {
                os.write(c);
            }
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
