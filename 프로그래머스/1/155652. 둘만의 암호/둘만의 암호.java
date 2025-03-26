class Solution {
    public String solution(String s, String skip, int index) {
        char[] table = new char['z' - 'a' + 1 - skip.length()];
        int count = 0;
        
        // 1. 알파벳 해독 테이블 생성
        for(char i = 'a'; i <= 'z'; i++) {
            char c = i;
            
            if (! skip.contains(String.valueOf(c))) {
                table[count++] = c;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        
        // 2. 디크립트
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int tableIndex = -1;

            // 해독 테이블 순회하여 문자 인덱스 찾기
            for (int j = 0; j < table.length; j++) {
                if (table[j] == c) {
                    tableIndex = j;
                    break;
                }
            }
            
            // 해독 테이블에서 인덱스 알파벳 가져오기
            tableIndex = (tableIndex + index) % table.length;
            stringBuilder.append(table[tableIndex]);
        }
        
        return stringBuilder.toString();
    }
}