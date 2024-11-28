package exercise.book.thread;

import exercise.book.common.ShareArea;

public class PrintThread extends Thread {

    public ShareArea shareArea;

    public PrintThread(ShareArea shareArea){
        this.shareArea = shareArea;
    }

    public void run() {
        if(shareArea.isRunning != true){
            synchronized (shareArea){
                try {
                    shareArea.wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("printThread : " + shareArea.result);
    }

}
