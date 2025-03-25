import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n; i>1; i--) { // 5, 4, 3, 2
			for(int j=i-1; j<n; j++) {
				System.out.print(" ");
			}
			
			for(int j=((i-1)*2)-1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}