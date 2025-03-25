import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        float[] score = new float[stdIn.nextInt()];

        for(int i=0; i<score.length; i++){
            score[i] = stdIn.nextInt();
        }
        Arrays.sort(score);

        float total = 0f;
        for(int i=0; i<score.length; i++){
            total += score[i]/score[score.length-1]*100;
        }

        System.out.println(total/ score.length);
    }
}