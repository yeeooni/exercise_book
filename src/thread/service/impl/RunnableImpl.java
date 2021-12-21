package thread.service.impl;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 1:12
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class RunnableImpl implements Runnable {

    String message;

    public RunnableImpl (String message) {
        this.message = message;
    }

    @Override
    public void run() {
        int i;
            for(i = 0; i < 500; i++)
                System.out.println(message);
    }

}
