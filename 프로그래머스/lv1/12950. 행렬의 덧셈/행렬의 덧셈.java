class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int nRow = arr1.length;
        int nCol = arr1[0].length;
        // 크기 초기화 안해도 되나? -> 해야되네 ㅋㅋ
        int[][] answer = new int[nRow][nCol];

        for (int i = 0; i < arr1.length; i++) {
            for ( int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;        
    }
}