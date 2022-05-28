import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //* 인풋
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //* 시스템
        int answer = hanSoo(n);

        //* 아웃풋
        System.out.println(answer);
    }

    public static int hanSoo(int n) {
        int answer = 0;
        int count = 99;
        if (n < 100) {
            return n;
        }
        if (n >= 99 ) {
            for (int i = 100; i < n + 1; i++) {
                char[] chars = (Integer.toString(i)).toCharArray();
                int len = chars.length;
                if (chars[2] - chars[1] == chars[1] - chars[0]) {
                    count += 1;
                }
            }
        }
        answer = count;
        return answer;
    }
}
