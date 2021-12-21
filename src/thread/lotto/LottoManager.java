package thread.lotto;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 1:22
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class LottoManager extends Thread {

    private final List<Integer> numbers;
    private final Count count;

    public LottoManager(List<Integer> numbers, Count count) {
        this.numbers = numbers;
        this.count = count;
    }

    @Override
    public void run () {
        int lottoNumber;

        do {
            lottoNumber = new Random().nextInt(45) + 1;
            System.out.println(this.getName() + " : " + lottoNumber);
        } while (numbers.contains(lottoNumber) && !numbers.isEmpty());

        numbers.add(lottoNumber);
        //count.countDown();
    }

}
