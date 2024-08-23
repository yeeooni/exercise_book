package 이것이_자바다.신용권의_Java_프로그래밍_정복.데이터_타입;

import 이것이_자바다.Abstract;

public class CharExample extends Abstract {

    @Override
    public String toBinary() {
        return "";
    }

    @Override
    public String toHex() {
        char c = 'A';
        int i = (int) c;
        return Integer.toHexString(i);
    }


}
