package Thread;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 1:01
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class ThreadManager extends Thread {

    String message;

    //NEW
    public ThreadManager(String message) {
        this.message = message;
    }

    /**
     * Thread run() 재정의
     */
    @Override
    public void run() {
        int i;
        for (i = 0; i < 500; i ++)
            System.out.println(message);
    }

}
