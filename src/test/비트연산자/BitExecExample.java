package 비트연산자;

import 이것이_자바다_신용권의_Java_프로그래밍_정복.Abstract;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BitExecExample {

    public int i = 8;
    public int n = i >> 3;
    public int nei = -i;

    // 00000000 00000000 00000000 00001000 (양수 8)
    // 오른쪽으로 3칸이동 후 빈공간을 MSB 부호 비트와 같은 값으로 채움

    public void print(String str){
        System.out.println(str);
    }

    public void print(Abstract abs){
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){


            bw.newLine();
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
