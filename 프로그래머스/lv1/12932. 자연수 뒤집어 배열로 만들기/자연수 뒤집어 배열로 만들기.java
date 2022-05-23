class Solution {
    public int[] solution(long n) {
        String str = n + "";
        int len = str.length();
        int[] answer = new int[len];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < len; i++) {
            answer[i] = charArray[len - 1 - i] - '0';
        }
        return answer;

    }
}