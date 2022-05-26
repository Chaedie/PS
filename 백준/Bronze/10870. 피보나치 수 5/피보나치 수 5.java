import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static int fibo (int n){
        int answer = 0;
        while (n > 1) {
            return fibo(n - 1) + fibo (n - 2);
        }
        if (n == 1) {
            answer = 1;
        }
        if (n == 0) {
            answer = 0;
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //* 시스템
        int answer = fibo(n);
        //* 아웃풋
        bw.write(Integer.toString(answer));

        bw.flush();
        br.close();
        bw.close();
    }
}
