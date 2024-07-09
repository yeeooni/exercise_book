package 스레드;

public class Thread_A extends Thread {

    static int n;

    static {
        n = 2;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("A-Thread : " + getName());
        }
    }

}
