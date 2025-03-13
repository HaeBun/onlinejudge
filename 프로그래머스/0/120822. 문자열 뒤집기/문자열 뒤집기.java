class Solution {
    public String solution(String my_string) {
        return reverseString(my_string);
    }
    
    public String reverseString(String string) {
        String temp = new String();
        int length = string.length();
        for(int i = 0; i < length; i++) {
            temp += string.charAt(length-i-1);
        }
        
        return temp;
        
    }
}