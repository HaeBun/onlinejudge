import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i=0; i<n; i++) { // 오름차순 별찍기
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			
			for(int j=0; j<(n-i-1)*2; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-2; i>=0; i--) { // 내림차순 별찍기
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			
			for(int j=0; j<(n-i-1)*2; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}