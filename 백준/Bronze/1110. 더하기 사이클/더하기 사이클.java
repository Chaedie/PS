import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //* 시스템
        int preNum = n;
        int preSum = 0;
        int next = 0;
        int count = 0;
        while(true){
            preSum = (preNum / 10) + (preNum % 10);
            next = ((preNum % 10) * 10) + (preSum % 10);
            count += 1;
            if (next == n){
                break;
            }
            preNum = next;
        }
        //* 아웃풋
        System.out.println(count);
    }
}


