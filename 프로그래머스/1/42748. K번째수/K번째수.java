import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = arrayParser(array, commands[i]);
        }

        return answer;
    }

    public int arrayParser(int[] array, int[] commands) {
        int i = commands[0];
        int j = commands[1];
        int k = commands[2];

        int[] parsedArray = Arrays.copyOfRange(array, i-1, j); 

        Arrays.sort(parsedArray);
        return parsedArray[k-1];
    }
}