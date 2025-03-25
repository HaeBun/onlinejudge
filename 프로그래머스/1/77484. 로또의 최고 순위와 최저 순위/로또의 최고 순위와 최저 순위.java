class Solution {
    public int[] wins = {6, 6, 5, 4, 3, 2, 1};
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int max = 0;
        int min = 0;
        
        
        // 1. 일치하는 것 부터 계산
        for(int i = 0; i < win_nums.length; i++) {
            for(int j = 0; j < lottos.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    max++;
                    min++;
                    break;
                }
            }
        }
        // 2. 알아볼 수 없는 수 당첨번호로 계산
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0)
                max++;
        }
        
        
        int[] answer = {wins[max], wins[min]};
        
        
        return answer;
    }
    
}