import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] tmp = new int[len];

        int count = 0;
        int p2 = 0;
        tmp[0] = arr[0];

        for (int p1 = 0; p1 < len; p1++) {
            if (arr[p1] == tmp[p2]) {
                continue;
            }
            if (arr[p1] != tmp[p2]) {
                p2++;
                tmp[p2] = arr[p1];
                count++;
            }
        }

        int[] answer = Arrays.copyOf(tmp, count + 1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}