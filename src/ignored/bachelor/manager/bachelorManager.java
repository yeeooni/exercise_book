package ignored.bachelor.manager;

import ignored.bachelor.service.Impl.BachelorServiceImpl;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-30
 * Time: 오후 12:46
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class bachelorManager {

    public static void main(String[] args) {
        BachelorServiceImpl service = new BachelorServiceImpl();
        service.viewMenu();
    }

}
