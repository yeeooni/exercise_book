package exercise.book.thread;

public class Thread_B extends Thread {

    public Thread_B() {
        setName("Thread-B");
    }

    @Override
    public void run() {
        System.out.println("B-Thread : " + getName());
    }

}
