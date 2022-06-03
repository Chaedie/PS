import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        StringBuilder str = new StringBuilder(String.valueOf(chars));

        answer = str.reverse().toString();
        return answer;
    }
}