package ignored.array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 4:30
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class ArrayManager {

    public static void main(String[] args) {
        int ten = 10, twenty = 20, thirty = 30;
        int number[] = new int []{10, 20, 30};

        int array [] = new int [3];
        for(int i = 0; i < array.length; i++)
            array[i] = number[i];

        System.out.println(Arrays.toString(array));
    }

}
