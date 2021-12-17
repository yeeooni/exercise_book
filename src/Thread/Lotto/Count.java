package Thread.Lotto;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 1:23
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class Count {

    int cnt;

    public Count(int count) {
        this.cnt = count;
    }

    public void countDown () {
        //System.out.println("Count down Started!");
        System.out.println(this.cnt);
        //System.out.println("End");
    }

    @Override
    public String toString() {
        return "Count{" +
                "cnt=" + cnt +
                '}';
    }
}
