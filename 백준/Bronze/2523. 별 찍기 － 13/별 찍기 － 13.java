import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		for(int i=0; i<2*n-1; i++) {
			if(i<n)
			{
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
			}
			else
			{
				for(int j=i; j<2*n-1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}