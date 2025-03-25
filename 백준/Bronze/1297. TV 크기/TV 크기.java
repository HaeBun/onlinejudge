import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int d = stdIn.nextInt();
        int h = stdIn.nextInt();
        int w = stdIn.nextInt();

        double r = Math.sqrt(Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2)));
        System.out.println((int)Math.floor(r*h) + " " + (int)Math.floor(r*w));
    }
}