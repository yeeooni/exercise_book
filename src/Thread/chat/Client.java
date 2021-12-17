package Thread.chat;

import java.io.*;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 5:45
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        GetThread getThread = null;
        PostThread postThread = null;
        socket = new Socket("192.168.0.59", 8000);
        getThread = new GetThread(socket);
        getThread.start();
    }

    static class GetThread extends  Thread {
        PrintWriter pw = null;
        BufferedReader br = null;
        Socket socket = null;

        public GetThread (Socket socket) throws IOException {
            InputStream is = socket.getInputStream();
            this.br = new BufferedReader(new InputStreamReader(is));
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            this.pw = new PrintWriter(osw);
        }

        public void run () {
            String message = null;
            while (true){
                try {
                    if (!((message = this.br.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.pw.println(message);
                this.pw.flush();
            }
        }
    }

    class PostThread extends Thread {
        PrintWriter pw = null;
        BufferedReader br = null;

        public PostThread (Socket socket) throws IOException {
            OutputStream os = socket.getOutputStream();
            this.pw = new PrintWriter(new OutputStreamWriter(os));
            InputStreamReader isr = new InputStreamReader(System.in);
            this.br = new BufferedReader(isr);
        }

        public void run () {
            String message = null;
            try {
                while (true){
                    if((message = br.readLine()) != null && ("quit".equals(message) || "close".equals(message) || "exit".equals(message))) break;
                    this.pw.println(message);
                    this.pw.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    pw.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
