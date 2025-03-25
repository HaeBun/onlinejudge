import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int w = stdIn.nextInt();
        int h = stdIn.nextInt();

        int x = stdIn.nextInt();
        int y = stdIn.nextInt();

        int t = stdIn.nextInt();

        x += t;
        y += t;

        if((x/w) % 2 == 0) {
            x %= w;
        } else {
            x = w - (x%w);
        }
        if((y/h) % 2 == 0) {
            y %= h;
        } else {
            y = h - (y%h);
        }
        System.out.println(x+" "+y);
    }
}
