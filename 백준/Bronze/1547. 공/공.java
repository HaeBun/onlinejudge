import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int M = stdIn.nextInt();
        int ball = 1;
        for(int i=0; i < M; i++) {
            int x = stdIn.nextInt();
            int y = stdIn.nextInt();

            if(x==ball) ball = y;
            else if(y==ball) ball=x;
        }
        System.out.println(ball);
    }
}
