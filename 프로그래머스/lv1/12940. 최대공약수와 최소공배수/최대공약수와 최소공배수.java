class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int small = Math.min(n, m);
        int gcd = 1;
        int lcm = n * m;

        for (int i = 1; i < small + 1; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        lcm = (n * m) / gcd;

        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
}