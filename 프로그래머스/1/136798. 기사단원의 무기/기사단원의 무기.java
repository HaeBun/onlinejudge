class Solution {
    private int limit;
    private int power;
    
    public int solution(int number, int limit, int power) {
        this.limit = limit;
        this.power = power;
        
        return ironWeight(1, number);
    }
    
    public int ironWeight(int index, int number) {
        if(index > number)
            return 0;
        
        // 제한 수치 초과
        if(getFactorCount(index) > limit)
            return power + ironWeight(++index, number);
        
        // 기본 공격력 합산
        else
            return getFactorCount(index) + ironWeight(++index, number);
    }
    
    // 약수 계산
    
    public int getFactorCount(int number) {
        int factor = 0;
        int sqrt = (int) Math.sqrt(number);
        
        for(int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    factor++; 
                } else {
                    factor += 2; 
                }
            }
        }
        return factor;
    }
}