import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        for(int i = 0; i < n; i++) {
            int temp = stdIn.nextInt();
            System.out.println(fibonacci(temp)+" "+fibonacci(temp+1));
        }
    }

    public static int fibonacci(int n) {
        int a = 1;
        int b = 0;
        int c = 1;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            return a;
        }
    }
}
