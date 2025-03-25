import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] counts = new int[N + 1];

        // 1. 단계별 사람 수 정리
        for (int stage : stages) {
            if (stage <= N) { // 스테이지가 N보다 큰 경우는 무시
                counts[stage - 1]++;
            } else {
                counts[N]++; // N보다 큰 스테이지는 N번째 인덱스에 포함
            }
        }
    }
}