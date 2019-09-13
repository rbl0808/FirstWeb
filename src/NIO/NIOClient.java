/**
 * FileName: NIOClient
 * Author: rbl
 * Date:
 **/
package NIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class NIOClient implements  Runnable{

    private String host;

    private int port;

    private Charset charset = Charset.forName("UTF-8");

    public NIOClient(String host,int port){
        super();
        this.host = host;
        this.port = port;
    }
    @Override
    public void run() {
        try(Socket s = new Socket(host,port); OutputStream out = s.getOutputStream();) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请出入:");
            String mess = scanner.nextLine();
            out.write(mess.getBytes(charset));

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NIOClient client = new NIOClient("localhost",9200);
        client.run();
    }
}
