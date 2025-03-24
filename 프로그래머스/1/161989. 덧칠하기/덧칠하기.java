class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        int index = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] > index) {
                result++; // 길이만큼 칠했을 때
                index = section[i] + m - 1; // 칠한만큼 이동 
            }
        }

        return result;
    }
}