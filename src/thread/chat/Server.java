package thread.chat;

import java.io.*;
import java.net.*;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 5:35
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class Server {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = null;
        BufferedReader br = null;
        Socket socket = null;

        ServerSocket ss = new ServerSocket(8000);
        System.out.println("==========================서버가 요청을 기다립니다.==========================");
        socket = ss.accept();
        InetAddress inetAddress = socket.getInetAddress();
        String ip = inetAddress.getHostAddress();
        System.out.println(ip + "주소의 클라이언트가 접속하였습니다.");

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        br =  new BufferedReader(isr);

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        pw = new PrintWriter(osw);

        String message = null;
        while ((message = br.readLine()) != null){
            if("quit".equals(message) || "exit".equals(message) || "close".equals(message)) break;
            System.out.println("This is a message : " + message);
            pw.println(message);
            pw.flush();
        }

        if(pw != null) pw.close();
        if(br != null) br.close();
        if(socket != null) socket.close();
    }

}
