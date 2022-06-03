import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        char[] chars = Long.toString(n).toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(String.valueOf(chars));
        answer = Long.parseLong(sb.reverse().toString());

        return answer;
    }
}