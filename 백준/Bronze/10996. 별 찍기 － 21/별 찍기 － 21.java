import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		if(n==1) System.out.println("*");
		
		else {
			for(int i=0; i<n*2; i++) {
				for(int j=0; j<n; j++) {
					if((i+j)%2==0) System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}