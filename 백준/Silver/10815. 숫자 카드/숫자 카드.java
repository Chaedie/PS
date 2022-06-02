import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> nums = new HashSet<>();
//        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        //* 시스템
        for (int i = 0; i < m; i++) {
            int answer = nums.contains(targets[i]) ? 1 : 0;
            System.out.print(answer + " ");
        }

        //* 아웃풋
        br.close();
        sc.close();
    }
}
