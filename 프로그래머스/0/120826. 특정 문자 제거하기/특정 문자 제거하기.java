class Solution {
    public String solution(String my_string, String letter) {
        return letterRemover(my_string, letter);
    }
    
    public String letterRemover(String myString, String letter) {
        // letter를 찾아서 "" 로 바꾸기
        return myString.replace(letter, "");
    }
}