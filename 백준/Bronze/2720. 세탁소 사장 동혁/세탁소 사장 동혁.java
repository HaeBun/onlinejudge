import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int T = stdIn.nextInt();

        for(int i = 0; i < T; i++) {
            int q, d, n;
            int p = stdIn.nextInt();

            q = p/25;
            p %= 25;
            d = p/10;
            p %= 10;
            n = p/5;
            p %= 5;

            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }
}
