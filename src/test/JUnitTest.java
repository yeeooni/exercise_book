import exercise.book.bitwise.BitExecExample;
import exercise.book.bitwise.BitLogicalExample;
import exercise.book.thread.*;
import org.junit.jupiter.api.Test;
import exercise.book.common.ShareArea;
import exercise.book.array.NumberArray;
import exercise.book.singleton.Singleton;
import 이것이_자바다_신용권의_Java_프로그래밍_정복.데이터_타입.CharExample;

public class JUnitTest {

    @Test
    public void 비트연산자(){
        BitExecExample bee = new BitExecExample();
        BitLogicalExample ble = new BitLogicalExample();

        bee.print(bee.toBinary(ble.and()));
        bee.print(bee.toBinary(ble.or()));
        bee.print(bee.toBinary(ble.xor()));
        //bee.print(bee.toBinary(bee.mi));
        bee.print(Integer.toBinaryString(bee.nei)); //음수 8의 2진수

        CharExample ce = new CharExample();
        bee.print(ce);

        //  11111111 11111111 11111111 11110111 1의보수
        //+ 00000000 00000000 00000000 00000001
        //--------------------------------------
        //  11111111 11111111 11111111 11111000
    }

    @Test
    public void 배열(){
        NumberArray numberArray = new NumberArray();
        numberArray.print();
    }

    @Test
    public void 싱글톤(){
        Singleton s = Singleton.getInstance();
        Singleton ss = Singleton.getInstance();

        System.out.print("첫번째 싱글톤 : " + s + " 두번째 싱글톤 : " +  ss);
    }

    @Test
    public void 멀티스레드_1() throws InterruptedException {
        Thread t = new Thread_A();
        t.start();

        Thread.sleep(1000); //1초 지연

        Thread tt = new Thread_B();
        tt.start();
    }

    @Test
    public void 멀티스레드_2 (){
        MultiThread multiThread = new MultiThread();
        multiThread.multiThread();
    }

    @Test
    public void 스레드커뮤니케이션(){
        ShareArea shareArea = new ShareArea();
        CalcThread calcThread = new CalcThread(shareArea);
        PrintThread printThread = new PrintThread(shareArea);

        calcThread.shareArea = shareArea;
        printThread.shareArea = shareArea;

        calcThread.start();
        printThread.start();
    }

}