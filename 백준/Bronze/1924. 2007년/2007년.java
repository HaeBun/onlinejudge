import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int sum = 0;

        int x = stdIn.nextInt();
        int y = stdIn.nextInt();

        for(int i=1; i<x; i++) sum += day[i-1];
        sum += y;

        System.out.println(week[sum%7]);
    }
}
