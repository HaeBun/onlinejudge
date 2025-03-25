import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int a[] = new int[3];
		
		for(int i=0; i<12; i++) 
		{
			if(i<4&&i>=0) {
				a[0] += Sc.nextInt();
			}
			else if(i<8&&i>=4) {
				a[1] += Sc.nextInt();
			}
			else {
				a[2] += Sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			if(a[i]==0) 
			{
				System.out.println("D");
			}
			else if(a[i]==1) 
			{
				System.out.println("C");
			}
			else if(a[i]==2)
			{
				System.out.println("B");
			}
			else if(a[i]==3)
			{
				System.out.println("A");
			}
			else if(a[i]==4)
			{
				System.out.println("E");
			}
		}
	}
}