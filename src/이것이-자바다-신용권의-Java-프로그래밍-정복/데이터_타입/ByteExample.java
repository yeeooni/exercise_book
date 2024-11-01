package 이것이_자바다.신용권의_Java_프로그래밍_정복.데이터_타입;

import 이것이_자바다.Abstract;

public class ByteExample extends Abstract {

    @Override
    public String toBinary() {
        int n = 128;
        return Integer.toBinaryString(n);
    }

    @Override
    public String toHex() {
        return "";
    }

}
