package 공통;

public class ShareArea {

    public double result;
    volatile public boolean isRunning;   //공유 영역에 데이터가 쓰였는지 확인하는 필드

}