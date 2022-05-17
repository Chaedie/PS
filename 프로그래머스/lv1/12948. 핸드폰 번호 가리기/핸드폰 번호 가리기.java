class Solution {
    public String solution(String phone_number) {
        char[] answerCharArray = phone_number.toCharArray();
        
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answerCharArray[i] = '*';
        }
        String answer = new String(answerCharArray);
        return answer;
    }
}