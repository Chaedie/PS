import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //* 인풋
        int n = sc.nextInt();

        int answer = 0;
        //* System
        for (int i = 1; i < n + 1; i++) {
            answer += i;
        }

        //* 아웃풋
        System.out.println(answer);
    }
}
