class Solution {
    public String[] weeks = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    // 윤년 기준 일 수
    public int[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public String solution(int a, int b) {
        return dayOfWeek(a, b);
    }

    public String dayOfWeek(int a, int b) {
        int days = 0; 
        for (int i = 0; i < a - 1; i++) {
            days += daysInMonth[i];
        }
        days += b;
        // 첫 시작이 금요일. +4 반영.
        return weeks[(days + 4) % 7]; 
    }
}