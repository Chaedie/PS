import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs1 = br.readLine().split(" ");
        int n = Integer.parseInt(strs1[0]);
        int k = Integer.parseInt(strs1[1]);
        
        int[] nums = new int[n];
        String[] strs2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strs2[i]);
        }

        //* 시스템
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int i = 1; i < n - k + 1; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            if (sum > max) {
                max = sum;
            }
        }

        //* 아웃풋
        System.out.println(max);
        br.close();
    }
}
