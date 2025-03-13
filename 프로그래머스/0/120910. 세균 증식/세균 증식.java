class Solution {
    public int solution(int n, int t) {
        return multiplyGerm(n, t);
    }
    
    public int multiplyGerm(int n, int t) {
        for(int i = 0; i < t; i++)
            n *= 2;
        
        return n;
    }
}