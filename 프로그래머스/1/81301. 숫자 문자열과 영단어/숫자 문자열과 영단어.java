class Solution {
    public static String[] numberString = { "zero", "one", "two", "three", "four", "five", 
                                           "six", "seven", "eight", "nine" };

    public int solution(String s) {
        return numberStringMixedParser(s);
    }
    
    public int numberStringMixedParser(String s) {
        for(int i = 0; i < numberString.length; i++) {
            String number = numberString[i];

            for(int j = 0; j < s.length() - number.length() + 1; j++) {
                int jPivot = j + number.length();

                if (s.substring(j, jPivot).equals(numberString[i])) {
                    s = s.substring(0, j) + i + s.substring(jPivot, s.length());
                    j = 0;
                }
            }
        }
        return Integer.valueOf(s);
    }
}