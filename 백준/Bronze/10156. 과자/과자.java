import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int result = 0;
		
		if(K*N>M) result += K*N-M;
		
		System.out.print(result);
	}
}