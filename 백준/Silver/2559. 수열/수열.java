import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
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
    }
}
