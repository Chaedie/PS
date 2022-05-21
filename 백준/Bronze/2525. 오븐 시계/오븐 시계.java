import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //* 인풋
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        int answer_h = 0;
        int answer_m = 0;
        int total = 0;

        //* System
        total = (h * 60) + m + time;
        answer_h = (total / 60) % 24;
        answer_m = total % 60;

        //* 아웃풋
        System.out.println(answer_h + " " + answer_m);
    }
}
