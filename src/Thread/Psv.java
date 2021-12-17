package Thread;

import Thread.Lotto.*;
import Thread.service.Impl.RunnableImpl;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 1:04
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class Psv {

    private static final int LOTTO_NUMBER_LIMIT = 6;

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Count count = new Count(LOTTO_NUMBER_LIMIT);
        //System.out.println("==== > " + numbers + "\t" + count);

        for(int i = 0; i < LOTTO_NUMBER_LIMIT; i++){
            Thread thread = new LottoManager(numbers, count);
            thread.start();
        }

        /*Thread first = new ThreadManager("first Thread!");
        Thread second = new ThreadManager("second Thread!");
        Thread three = new ThreadManager("three Thread!");

        first.start();
        second.start();
        three.start();

        Thread firstRun = new Thread(new RunnableImpl("first runnable Thread!"));
        Thread secondRun = new Thread(new RunnableImpl("second runnable Thread!"));
        Thread threeRun = new Thread(new RunnableImpl("three runnable Thread!"));

        firstRun.start();
        secondRun.start();
        threeRun.start();*/

    }

}
