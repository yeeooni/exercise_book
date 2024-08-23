package 이것이_자바다.main;

import 이것이_자바다.Abstract;
import 이것이_자바다.신용권의_Java_프로그래밍_정복.데이터_타입.ByteExample;
import 이것이_자바다.신용권의_Java_프로그래밍_정복.데이터_타입.CharExample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        //ByteExample b = new ByteExample();
        //print(b);

        CharExample c = new CharExample();
        print(c);
    }

    public static void print(Abstract obj){
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            //bw.write(obj.toBinary());

            bw.write("toHexString(): " + obj.toHex());
            bw.newLine();

            char c = '\u0041';
            bw.write(String.valueOf(c));

            bw.flush();
        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }
}
