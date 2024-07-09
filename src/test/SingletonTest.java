import org.junit.jupiter.api.Test;
import 싱글톤.Singleton;

public class SingletonTest {

    @Test
    public void 싱글톤(){
        Singleton s = Singleton.getInstance();
        Singleton ss = Singleton.getInstance();

        System.out.println(s);
        System.out.println(ss);
    }

}
