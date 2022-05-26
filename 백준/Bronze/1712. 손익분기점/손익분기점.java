import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] inputs = input.split(" ");

        int fix = Integer.parseInt(inputs[0]);
        int var = Integer.parseInt(inputs[1]);
        int price = Integer.parseInt(inputs[2]);

        long count = 0;
        long answer = -1;

        //* 시스템
        if (var >= price) {
            count = Integer.MAX_VALUE;
        } else {
            answer = (fix / (price-var)) + 1;
        }


        //* 아웃풋
        bw.write(Long.toString(answer));
        bw.flush();
        br.close();
        bw.close();
    }
}
