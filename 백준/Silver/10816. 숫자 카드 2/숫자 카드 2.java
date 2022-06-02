import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");


        //* 시스템
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(strA[i]);
            map.put(key, map.getOrDefault(key,0) + 1);
        }

        //* 아웃풋
        int m = Integer.parseInt(br.readLine());
        String[] strB = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(strB[i]);
            bw.write(map.getOrDefault(key,0) + " ");
        }
        bw.flush();
        br.close();
        sc.close();
    }
}
