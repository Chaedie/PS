import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sumArr = new int[n+1];
        sumArr[0] = 0;
        for (int i = 0; i < n; i++) {
            sumArr[i + 1] = sumArr[i] + arr[i];
        }
        //* 시스템
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            //* 아웃풋
            System.out.println(sumArr[end] - sumArr[start - 1]);
        }
    }
}


