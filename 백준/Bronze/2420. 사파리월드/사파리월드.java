import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long N = stdIn.nextLong();
        long M = stdIn.nextLong();

        System.out.println(Math.abs(N-M)); // 절댓값 구하기 Math.abs();
    }
}
