import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //* 인풋
        int x = sc.nextInt();
        int y = sc.nextInt();
//        int[] nums = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
        int answer = 0;

        //* System
        if (x > 0) {
            if (y > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if (y > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }

        //* 아웃풋
        {
            System.out.println(answer);
        }
    }
}
