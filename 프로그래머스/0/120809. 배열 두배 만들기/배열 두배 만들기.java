class Solution {
    public int[] solution(int[] numbers) {
        return multiplyElements(numbers);
    }
    
    public int[] multiplyElements(int[] numbers) {
        for(int i = 0; i < numbers.length; i++)
            numbers[i] *= 2;
        
        return numbers;
    }
}