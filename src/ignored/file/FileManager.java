package ignored.file;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 3:58
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class FileManager {

    public static void main(String[] args) throws IOException {
        InputStream is;
        OutputStream os;

        //fixme 절대경로에 존재하는 파일을 가져온다.
        File file = new File("C:\\dev\\exercise_book\\exercise_book.iml");
        is = new FileInputStream(file);

        long l = file.length();
        byte b[] = new byte[(int) l];
        int i = is.read(b);

        String message = new String (b, 0, i);
        System.out.println(i + "-> byte size");
        System.out.println("message : " + message);

        File copy = new File("C:\\dev\\exercise_book\\exercise_book_copy.iml");
        os = new FileOutputStream(copy);
        os.write(b);

        if(is != null) is.close();
        if(os != null) os.close();

    }

}
