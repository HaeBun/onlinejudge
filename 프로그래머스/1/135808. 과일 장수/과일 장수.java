import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        int boxCount = score.length / m;
        int[][] box = new int[boxCount][m];
        
        // 1. 내림차순 정렬
        Integer[] integerScore = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            integerScore[i] = score[i];
        }
        Arrays.sort(integerScore, Collections.reverseOrder());

        // 2. 2차원 분배
        for(int i = 0; i < boxCount * m; i++) {
            box[i / m][i % m] = integerScore[i];
        }

        // 3. 가장 점수가 낮은 사과 찾아서 이익 계산 및 누적
        for(int i = 0; i < boxCount; i++) {
            result += box[i][m - 1] * m;
        }
        return result;
    }
}