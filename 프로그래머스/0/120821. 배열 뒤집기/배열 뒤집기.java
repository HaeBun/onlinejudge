class Solution {
    public int[] solution(int[] num_list) {
        return rollOver(num_list);
    }
    
    public int[] rollOver(int[] numList) {
        int[] rollOverList = new int[numList.length];
        
        for(int i=0; i < numList.length; i++) {
            rollOverList[i] = numList[numList.length-i-1];
        }
        
        return rollOverList;
    }
}