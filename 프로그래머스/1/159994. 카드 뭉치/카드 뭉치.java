class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        return cardDummys(cards1, cards2, goal);
    }

    public String cardDummys(String[] cards1, String[] cards2, String[] goal) {
        int cards1Peek = 0;
        int cards2Peek = 0;

        for (int i = 0; i < goal.length; i++) {
            String keyword = goal[i];

            if (cards1Peek < cards1.length 
                    && keyword.equals(cards1[cards1Peek])) {
                cards1Peek++;
                continue;
            } 
            else if (cards2Peek < cards2.length 
                       && keyword.equals(cards2[cards2Peek])) {
                cards2Peek++;
                continue;
            } 
            else {
                return "No";
            }
        }
        return "Yes";
    }
}