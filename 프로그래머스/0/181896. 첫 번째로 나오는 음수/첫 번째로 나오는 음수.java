class Solution {
    public int solution(int[] num_list) {
        return negativeIndex(num_list);
    
    }
    
    public int negativeIndex(int[] numList) {
        for(int i = 0; i < numList.length; i++)
            if(numList[i] < 0)
                return i;
        return -1;
    }
}