class Solution {
    public long solution(long n) {
        long answer = -1;
        double x = Math.sqrt((double) n);

        if (x == Math.floor(x)) {
            answer = (long) Math.pow(x + 1, 2);
            return answer;
        }

        return answer;
    }
}