import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int max = 0;
		int P = 0;
		
		for(int i=0; i<4; i++) {
			P -= stdIn.nextInt();
			P += stdIn.nextInt();
			
			if(max<P) max = P;		
		}
		System.out.println(max);
	}
}