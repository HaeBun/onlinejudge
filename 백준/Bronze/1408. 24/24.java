import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String timeFormat1 = stdIn.nextLine();
        String timeFormat2 = stdIn.nextLine();
        int second1 = Integer.valueOf(timeFormat1.split(":")[0]) * 3600
                + Integer.valueOf(timeFormat1.split(":")[1]) * 60
                + Integer.valueOf(timeFormat1.split(":")[2]);

        int second2 = Integer.valueOf(timeFormat2.split(":")[0]) * 3600
                + Integer.valueOf(timeFormat2.split(":")[1]) * 60
                + Integer.valueOf(timeFormat2.split(":")[2]);

        if (second1 <= second2) {
            int s = second2-second1;

            int h = s/3600;
            s %= 3600;
            int m = s/60;
            s %= 60;

            System.out.println(String.format("%02d:%02d:%02d", h, m, s));
        } else {
            int s = 86400 - ( second1-second2 );

            int h = s/3600;
            s %= 3600;
            int m = s/60;
            s %= 60;

            System.out.println(String.format("%02d:%02d:%02d", h, m, s));
        }

    }
}