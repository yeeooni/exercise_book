import org.junit.jupiter.api.Test;
import 스레드.Thread_A;
import 스레드.Thread_B;

public class ThreadTest {

    @Test
    public void 스레드_테스트() throws InterruptedException {
        Thread t = new Thread_A();
        t.start();

        Thread.sleep(500);

        Thread tt = new Thread_B();
        tt.start();
    }

}
