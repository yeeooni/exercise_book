package File;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 3:51
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class BufferedReaderManager {

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        FileWriter fw;

        //fixme 시스템에서 입력한 값을 파일 이름으로 사용한다.
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This is a copy file :");
        String file = br.readLine();
        fw = new FileWriter(file);

        //fixme 입력한 이름이 파일이름이 된다.
        br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String message;

        while((message = br.readLine()) != null){
            System.out.println(message);
            fw.write(message + "r\n");
        }
    }

}
