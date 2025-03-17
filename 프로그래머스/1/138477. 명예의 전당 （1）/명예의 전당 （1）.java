// FIFO 로 큐에 데이터 밀어주면서 정렬 전당 크기 넘을 때마다 한 개씩 poll.
// java는 PriorityQueue;
// queue의 가장 마지막 값 호출은 peek();

import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        return bottomScores(k, score);
    }

    public int[] bottomScores(int k, int[] score) {
        // 명예의 전당
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        
        // 발표 점수
        int[] result = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            result[i] = queue.peek();
        }
        return result;
    }
}