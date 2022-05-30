class Solution {
     public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        int len = chars.length;
        if (len % 2 == 1){
            answer = Character.toString(chars[(len / 2)]);
        } else {
            answer += Character.toString(chars[(len / 2) -1]);
            answer += Character.toString(chars[(len/2)]);
        }
        return answer;
    }
}