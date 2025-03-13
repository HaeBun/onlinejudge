class Solution {
    public int solution(int n) {
        return squareCalculator(n);
    }
    
    
    // 큰 수면 1
    // 같으면 0 
    public int squareCalculator(int n) {
        int num = 1;
        
        for(int i = 1; i< n; i++) {
            num = i*i;
            
            if (num > n) {
                break;
            }
            else if (num == n)
                return 1;
            else 
                continue;
        }
        
        return 2;
    }
}