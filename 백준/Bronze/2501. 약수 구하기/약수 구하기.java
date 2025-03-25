import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int p = stdIn.nextInt();
		int q = stdIn.nextInt();
		
		int count = 0;
		int res = 0;
		
		for(int i=1; i<=p; i++) {
			if(p%i==0) {
				count++;
			}
			
			if(count == q) {
				res = i;
				break;
			}
			
		}
		System.out.println(res);
	}
}