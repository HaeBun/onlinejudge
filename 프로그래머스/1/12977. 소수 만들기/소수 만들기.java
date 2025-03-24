class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int first = nums[i];
                    int second = nums[j];
                    int third = nums[k];
                    
                    if (isPrime(first + second + third)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(int number) {
        if (number % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }
}