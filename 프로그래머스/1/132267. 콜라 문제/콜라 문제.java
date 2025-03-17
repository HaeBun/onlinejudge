class Solution {
    public int solution(int a, int b, int n) {
        return getCokesByEmptyBottle(a, b, n);
    }
    
    
    public int getCokesByEmptyBottle(int a, int b,  int n) {
        if(n >= a) {
            return b + getCokesByEmptyBottle(a, b, n-a+b);            
        }
        return 0;        
    }
}