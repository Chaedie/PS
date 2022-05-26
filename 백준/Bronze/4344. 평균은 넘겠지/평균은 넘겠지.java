import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int j = 0; j < n; j++) {
            String[] strs = br.readLine().split(" ");
            int len = Integer.parseInt(strs[0]);
            double[] arr = new double[len];
            double sum = 0;
            double avg = 0;
            for (int i = 0; i < len; i++) {
                arr[i] = Double.parseDouble(strs[i + 1]);
                sum += arr[i];
            }
            avg = sum / len;
            double count = 0;
            for (int i = 0; i < len; i++) {
                if(arr[i] > avg){
                    count++;
                }
            }
            double answer = (count * 100/ len);
            bw.write(String.format("%.3f",answer) + "%\n");
        }



        //* 시스템
        //* 아웃풋
        bw.flush();
        br.close();
        bw.close();
    }
}
