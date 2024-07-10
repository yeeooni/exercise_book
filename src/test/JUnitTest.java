import org.junit.jupiter.api.Test;
import 배열.NumberArray;
import 스레드.MultiThread;
import 스레드.Thread_A;
import 스레드.Thread_B;
import 싱글톤.Singleton;

public class JUnitTest {

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

}