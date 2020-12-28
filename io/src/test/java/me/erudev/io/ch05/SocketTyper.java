package me.erudev.io.ch05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;

/**
 * @author pengfei.zhao
 * @date 2020/12/28 19:41
 */
public class SocketTyper {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java SocketTyper url1");
            return;
        }
        Socket s = null;
        try {
            URL url = new URL(args[0]);
            String host = url.getHost();
            int port = url.getPort();
            String file = url.getFile();
            if (file == null)
                file = "/";
            if (port <= 0)
                port = 80;
            s = new Socket(host, port);
            String request = "GET " + file + " HTTP/1.1\r\n"
                    + "User-Agent: SocketTyper\r\n"
                    + "Accept: text/*\r\n"
                    + "Host: " + host
                    + "\r\n" + "\r\n";
            byte[] b = request.getBytes("US-ASCII");
            OutputStream out = s.getOutputStream();
            InputStream in = s.getInputStream();
            out.write(b);
            out.flush();
            for (int c = in.read(); c != -1; c = in.read()) {
                System.out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (s != null && s.isConnected()) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
