import 클래스.Singleton;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @Test
    public void 싱글톤(){
        Singleton s = Singleton.getInstance();
        Singleton ss = Singleton.getInstance();

        System.out.println(s);
        System.out.println(ss);
    }

}