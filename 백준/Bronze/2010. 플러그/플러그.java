import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cnt = 1;
		
		for(int i=0; i<n; i++) {
			cnt += stdIn.nextInt() - 1;
		}
		
		System.out.println(cnt);
	}
}