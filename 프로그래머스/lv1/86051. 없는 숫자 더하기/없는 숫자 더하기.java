import java.util.*;
class Solution {
    public int solution(int[] numbers) {
       int answer = 0;
        int n = numbers.length;
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(numbers);

        while (p1 < n) {
            if (numbers[p1] == p2) {
                p1++;
                p2++;
            } else {
                answer += p2;
                p2++;
            }
        }
        while (p2 < 10) {
            answer += p2;
            p2++;
        }
        return answer;
    }
}