import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		for(int i=0; i<n; i++) 
		{
			for(int j=n-1; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<((i+1)*2)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}