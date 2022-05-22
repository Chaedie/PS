import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //* 인풋
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        //* System
        int len = coins.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (k / coins[len - 1 - i] != 0) {
                count += k / coins[len - 1 - i];
                k = k % coins[len - 1 - i];
            }
        }

        //* 아웃풋
        System.out.println(count);
    }
}
