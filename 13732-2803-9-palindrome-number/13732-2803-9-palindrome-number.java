class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string.
        String numberString = String.valueOf(x);

        // then, start from the middle of the string and compare the left and right sides.
        for(int i = 0; i < numberString.length() / 2; i++) {
            if(numberString.charAt(i) != numberString.charAt(numberString.length()-i-1)) 
                return false;
        }
        return true;
    }
}