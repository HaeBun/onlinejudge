class Solution {
    public int solution(int angle) {
        return angleParser(angle);
    }
    
    public int angleParser(int angle) {
        if(angle < 90)
            return 1;
        else if (angle == 90)
            return 2;
        else if(angle > 90 && angle < 180)
            return 3;
        else //if (angle == 180)
            return 4;
    }
}