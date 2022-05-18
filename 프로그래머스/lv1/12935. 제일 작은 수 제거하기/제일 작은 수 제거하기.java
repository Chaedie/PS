class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int[] answerException = new int[n];
        int[] answer = new int[n - 1];

        // 예외처리
        if (n == 1) {
            answerException[0] = -1;
            return answerException;
        }

        // 작은 수 인덱스 찾기
        int p1 = 0;
        int p2 = 0;
        for (p2 = 0; p2 < n; p2++) {
            if (arr[p1] > arr[p2]) {
                p1 = p2;
            }
        }

        // answer 만들기
        for (int i = 0; i < p1; i++) {
            answer[i] = arr[i];
        }
        for (int i = p1; i < n - 1; i++) {
            answer[i] = arr[i + 1];
        }

        return answer;
    }
}