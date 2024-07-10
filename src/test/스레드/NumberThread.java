package 스레드;

public class NumberThread extends Thread {

    static int n = 10;

    public void run() {
        for(int i = 1; i <= n; i++){
            System.out.print(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

}
