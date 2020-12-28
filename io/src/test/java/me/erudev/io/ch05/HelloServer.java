package me.erudev.io.ch05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author pengfei.zhao
 * @date 2020/12/28 19:56
 */
public class HelloServer {
    public static void main(String[] args) {
        int port = 2345;
        try {
            ServerSocket ss = new ServerSocket(port);
            while (true){
                Socket s = ss.accept();
                String response = "Hello " + s.getInetAddress( )
                        + " on port "
                        + s.getPort( )
                        + "\r\n"; response
                        += "This is "
                        + s.getLocalAddress( )
                        + " on port " + s.getLocalPort( )
                        + "\r\n";
                OutputStream out = s.getOutputStream();
                out.write(response.getBytes(StandardCharsets.US_ASCII));
                out.flush();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
