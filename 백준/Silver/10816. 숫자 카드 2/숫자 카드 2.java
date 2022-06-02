import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());
        int[] numsA = new int[n];
        String[] strA = br.readLine().split(" ");
        HashMap<Integer,Integer> aMap = new HashMap<>();

        //* 시스템
        for (int i = 0; i < n; i++) {
            numsA[i] = Integer.parseInt(strA[i]);
            aMap.put(numsA[i],aMap.getOrDefault(numsA[i],0) + 1);
        }

        //* 아웃풋
        int m = Integer.parseInt(br.readLine());
        String[] strB = br.readLine().split(" ");

        int answer = 0;
        for (int i = 0; i < m; i++) {
            answer = aMap.getOrDefault(Integer.parseInt(strB[i]),0);
            bw.write(answer + " ");
        }
        bw.flush();
        br.close();
        sc.close();
    }
}
