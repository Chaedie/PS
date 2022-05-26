import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static int factorial(int n){

        if ( n <= 1 ){
            return 1;
        }
        int answer = n * factorial(n - 1);
        return answer;
    }


    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //* 시스템
        int answer = factorial(n);
        //* 아웃풋
        bw.write(Integer.toString(answer));

        bw.flush();
        br.close();
        bw.close();
    }
}
