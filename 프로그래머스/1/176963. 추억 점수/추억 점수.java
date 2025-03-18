class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            answer[i] = memoryScore(name, yearning, photo[i]);
        }

        return answer;
    }

    public int memoryScore(String[] name, int[] yearning, String[] photoSection) {
        int score = 0;
        
        for (int i = 0; i < photoSection.length; i++) {
            for (int j = 0; j < name.length; j++) { 
                
                if (photoSection[i].equals(name[j]))
                    score += yearning[j];
                
            }
        }
        
        return score;
    }
}