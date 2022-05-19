import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
       int[] answer = new int[commands.length];

        //TODO for로 감싸기
        for (int x = 0; x < commands.length; x++) {
            int end = commands[x][1];
            int start = commands[x][0];
            int getKey = commands[x][2];
            int lengthOfTmpArray = end - start + 1;
            int[] tmpArray = new int[lengthOfTmpArray];
            int j = 0;
            for (int i = start - 1; i < end; i++) {
                tmpArray[j++] = array[i];
            }
            Arrays.sort(tmpArray);
            answer[x] = tmpArray[getKey - 1];
        }

        return answer;
    }
}