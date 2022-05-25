import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);

//            bw.write(Integer.toString(a + b) + "\n");
            bw.write("Case #"
                + (i + 1)
                + ": "
                + a
                + " + "
                + b
                + " = "
                + (a + b)
                + "\n");
        }
        //* 시스템
        //* 아웃풋
        bw.flush();
        br.close();
        bw.close();
    }
}
