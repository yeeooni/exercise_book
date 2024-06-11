package ignored.Abstract;

import java.io.IOException;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 4:18
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class AbstractManager {

    public static void main(String[] args) throws IOException {

        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("calc");

        Calendar calendar = new GregorianCalendar();
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year + "년" + month + "월" + day + "일" + hour + "시간" + minute + "분" + second + "초");

    }

}
