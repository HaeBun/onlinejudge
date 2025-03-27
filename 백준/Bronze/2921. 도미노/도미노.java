import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cnt = 0;
		for(int i=0; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				cnt += i+j;
			}
		}
		System.out.println(cnt);
	}
}