package 이것이_자바다.main;

import 이것이_자바다.Abstract;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        int i = 8;
        int n = i >> 3;
        // 00000000 00000000 00000000 00001000 (양수 8)
        // 오른쪽으로 3칸이동 후 빈공간을 MSB 부호 비트와 같은 값으로 채움
        print(String.valueOf(n));

        int nei = -i;
        print("음수 8의 2진수: " + Integer.toBinaryString(nei) + "");
        //  11111111 11111111 11111111 11110111
        //+ 00000000 00000000 00000000 00000001
        //---------------------------------------
        //  11111111 11111111 11111111 11111000 (음수 8)
    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(Abstract obj){
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }
}
