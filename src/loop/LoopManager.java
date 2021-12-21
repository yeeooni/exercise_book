package loop;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 6:24
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class LoopManager {

    public static void main(String[] args) {
        //fixme 2 씩 증가
        for(int i = 1; i < 11; i +=2)
            System.out.println(i + "\t");

        //fixme 10단위로 줄바꿈
        for(int i = 1; i < 101; i++){
            System.out.println(i + "\t");
            if(i % 2 == 0)
                System.out.println("\t");
        }
    }

}
