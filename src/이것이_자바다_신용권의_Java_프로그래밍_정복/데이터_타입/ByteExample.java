package 이것이_자바다_신용권의_Java_프로그래밍_정복.데이터_타입;

import 이것이_자바다_신용권의_Java_프로그래밍_정복.Abstract;

public class ByteExample extends Abstract {

    @Override
    public String toBinary() {
        int n = 128;
        return Integer.toBinaryString(n);
    }

    @Override
    public String toHex() {
        int n = 128;
        return Integer.toHexString(n);
    }

}
