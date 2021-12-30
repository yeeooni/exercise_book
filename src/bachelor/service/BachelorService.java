package bachelor.service;

import bachelor.vo.BachelorVO;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-30
 * Time: 오후 12:47
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public interface BachelorService {

    void viewMenu ();

    void registerMenu ();

    int register (BachelorVO bachelorVO);

    void findMenu ();

    BachelorVO find (String name);

    int deleteMenu ();

    int deleted (String name);

    void selectAll ();

    void exit ();

}
