// Stack

class Solution {
    public String solution(int[] food) {
        return foodCourseMaker(food);
    }
    
    public String foodCourseMaker(int[] food) {
        for(int i = 1; i < food.length; i++) {
            if(food[i] % 2 == 1)
                food[i] -= 1;
        }
        return foodCourse(food, 1, food.length);
    }

    public String foodCourse(int[] food, int index, int end) {
        if(index == end)
            return "0";
        
        if(food[index] == 0)
            return foodCourse(food, ++index, end);
        
        food[index] -= 2;
        
        return String.valueOf(index) 
            + foodCourse(food, index, end)
            + String.valueOf(index);
        
    }
}