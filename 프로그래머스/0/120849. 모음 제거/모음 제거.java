class Solution {
    public String solution(String my_string) {
        return vowelParser(my_string);
    }
    
    public String vowelParser(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    continue;
            }
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }
}