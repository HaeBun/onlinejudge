class Solution {
    public int solution(String message) {
        int answer = 0;
        return messageMinimumLength(message);
    }
    
    
    /*
        1. 한 글자당 2cm
        2. 공백도 하나의 문자로 취급
        3. 여백은 생각하지 않음
    */
    public int messageMinimumLength(String message) {
        return message.length() * 2;
    }
}