import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        HashSet<String> strs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            strs.add(br.readLine());
        }

        //* 시스템
        int count = 0;
        String target = "";
        for (int i = 0; i < m; i++) {
            target = br.readLine();
            if (strs.contains(target)) {
                count += 1;
            }
        }

        //* 아웃풋
        System.out.println(count);
        br.close();
        sc.close();
    }
}
