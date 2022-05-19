import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //* 인풋
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        //* System
        Arrays.sort(nums);
        int count = 0;
        int sum = 0;
        for (int p1 = 0; p1 < n; p1++) {
            for (int p2 = p1 + 1; p2 < n; p2++) {
                sum = nums[p1] + nums[p2];
                if (sum == x) {
                    count++;
                    break;
                }
                if (sum > x) {
                    break;
                }
            }
        }
        //* 아웃풋
        System.out.println(count);

    }
}
