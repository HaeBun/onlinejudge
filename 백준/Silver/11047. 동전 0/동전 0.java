import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int K = stdIn.nextInt();
        int values[] = new int[N];

        int count = 0;

        for(int i = 0; i < N; i++) {
            values[i] = stdIn.nextInt();
        }

        for(int i = N-1; i >=0; i--) {
            if(K >= values[i]) {
                count += K/values[i];
                K %= values[i];
            }
        }
        System.out.println(count);
    }
}