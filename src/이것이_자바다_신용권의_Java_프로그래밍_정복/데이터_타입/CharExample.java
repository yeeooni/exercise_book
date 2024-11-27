package 이것이_자바다_신용권의_Java_프로그래밍_정복.데이터_타입;

import 이것이_자바다_신용권의_Java_프로그래밍_정복.Abstract;

public class CharExample extends Abstract {

    @Override
    public String toBinary() {
        char c = 'A' + 1;
        return Integer.toBinaryString(c);
    }

    @Override
    public String toHex() {
        char c = 'A';
        int i = c; // char (2byte) int (4byte) auto-boxing
        return Integer.toHexString(i);
    }


}
