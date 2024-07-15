package 스레드;

import 공통.ShareArea;

public class CalcThread extends Thread {

    public ShareArea shareArea;

    public CalcThread(ShareArea shareArea) {
        this.shareArea = shareArea;
    }

    public void run() {
        //shareArea.result = Math.PI;System.out.println("Before : " + shareArea.result);
        double total = 0.;

        //loop 횟수를 굉장히 많이 늘리면 아래 for statement 자체를 실행시키지 않음
        //CalcThread 가 계산된 파이 값을 공유 영역에 쓰기 전에 PrintThread 가 공유 영역의 데이터를 읽어감

        for(int i = 1; i < 1000000; i += 2){
            if(i / 2 % 2 == 0) total += 1. / i;
            else total -= 1. / i;
        }

        shareArea.result = total * 4;
        shareArea.isRunning = true;

        synchronized (shareArea){
            shareArea.notify();
        }
    }

}
