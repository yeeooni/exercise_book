import org.junit.jupiter.api.Test;
import 스레드.NumberThread;

public class MultiThreadTest {

    //1. 스레드 생성
    //2. 스레드 시작
    //3. 스레드 할 일 기술
    /*
        스레드가 동시에 실행되는 것이 아니라 프로그램의 실행 시간을
        아주 작은 간격으로 나누어 스레드들을 번갈아 실행하는 것
          +----------+
          | 스레드 시작 |
          +----------+
          +----------+        +----------+
          | 스레드 생성 | ====== | 스레드 시작 |
          +----------+        +----------+
        +---------------+   +--------------+
        | A부터 Z까지 출력 |   | 0부터 9까지 출력 |
        +---------------+   +--------------+
           +---------+         +---------+
           | 스레드 끝 |         | 스레드 끝 |
           +---------+         +---------+
     */

    @Test
    public void test () {
        Thread thread = new NumberThread();
        thread.start();

        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
