import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        for(int i = 0; i < n; i++) {
            double d = stdIn.nextDouble();
            System.out.printf("$%.2f\n", d*80/100);
        }

    }
}
