import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] counts = new int[N + 1];

        // 1. 단계별 사람 수 정리
        for (int stage : stages) {
            if (stage <= N) { 
                counts[stage - 1]++;
            }
        }
        
        double[][] failureRate = new double[N][2]; 
        int parent = stages.length;

        // 2. 실패율 계산
        for (int i = 0; i < N; i++) {
            double failure;

            if (parent == 0) {
                failure = 0;
            } else {
                failure = (double) counts[i] / parent;
                parent -= counts[i];
            }
            failureRate[i][0] = failure; 
            failureRate[i][1] = i + 1;
        }
        
        // 3. 정렬
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (failureRate[j][0] < failureRate[j + 1][0]) {
                    double[] temp = failureRate[j];
                    failureRate[j] = failureRate[j + 1];
                    failureRate[j + 1] = temp;
                }
            }
        }        
        
        // 4. 출력 결과
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failureRate[i][1];
        }

        return answer;
    }
}