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
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        //* System

        // A 정렬
        Arrays.sort(nums);
        // Binary Search
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;
            int mid = 0;
            int answer = 0;
            while (left <= right) {
                mid = left + ((right - left) / 2);
                if (nums[mid] == targets[i]) {
                    answer = 1;
                    break;
                }
                if (nums[mid] < targets[i]) {
                    left = mid + 1;
                    mid = left + ((right - left) / 2);
                    continue;
                }
                if (nums[mid] > targets[i]) {
                    right = mid - 1;
                    mid = left + ((right - left) / 2);
                    continue;
                }
            }
            //* 아웃풋
            System.out.println(answer);
        }
    }
}
