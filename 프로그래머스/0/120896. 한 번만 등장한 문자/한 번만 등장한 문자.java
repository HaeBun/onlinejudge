class Solution {
    public String solution(String s) {
        int[] counts = new int['z' - 'a' + 1];
        
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] == 1)
                result += Character.toString('a' + i);
        }
        
        return result;
    }
}