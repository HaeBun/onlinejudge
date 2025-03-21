class Solution {
    public int[] solution(int[] answers) {
        int[] pattern1 = { 1, 2, 3, 4, 5 };
        int[] pattern2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] pattern3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] scores = new int[3];
        
        scores[0] = patternResult(answers, pattern1);
        scores[1] = patternResult(answers, pattern2);
        scores[2] = patternResult(answers, pattern3);
        
        // 최고 점수
        int maxScore = 0;
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        
        // 가장 높은 점수 받은 사람
        int winnerCount = 0;
        for (int score : scores) {
            if (score == maxScore) {
                winnerCount++;
            }
        }

        int[] winners = new int[winnerCount];
        int winnerIndex = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                winners[winnerIndex++] = i + 1;
            }
        }
        
        return winners;
    }
    
    
    public int patternResult(int[] answers, int[] patterns) {
        int count = 0;
        for(int i = 0; i < answers.length; i++)
            if( answers[i] == patterns[i % patterns.length])
                count++;
        return count;
    }
    
}