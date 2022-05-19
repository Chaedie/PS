import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //* 인풋
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int answer = 0;
        int max = 0;

        //* System
        if (x == y && y == z) {
            answer += 10000 + (x * 1000);
        } else if (x == y) {
            answer += 1000 + (x * 100);
        } else if (y == z) {
            answer += 1000 + (y * 100);
        } else if (z == x) {
            answer += 1000 + (z * 100);
        } else {
            max = Math.max(x, y);
            max = Math.max(max, z);
            answer += max * 100;
        }

        //* 아웃풋
        System.out.println(answer);

    }
}
