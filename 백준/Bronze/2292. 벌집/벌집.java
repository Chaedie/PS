import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //* 시스템
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);

        if (n == 1) {
            System.out.println(1);
        } else{
            int i = 1;
            while (true) {
                int curValue = arr.get(i - 1);
                int nextValue = arr.get(i - 1) + (6 * i);
                arr.add(nextValue);
                if ((nextValue >= n) && (curValue < n)){
                    System.out.println(arr.indexOf(nextValue) + 1);
                    break;
                }
                i++;
            }
        }
        //* 아웃풋
//        bw.write(Long.toString(answer));
//        bw.flush();
        br.close();
//        bw.close();
    }
}
