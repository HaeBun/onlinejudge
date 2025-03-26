import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int result[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			int r = Sc.nextInt();
			int e = Sc.nextInt();
			int c = Sc.nextInt();
			
			if(r<(e-c)) 
			{
				result[i] = 0;
			}
			else if(r==(e-c))
			{
				result[i] = 1;
			}
			else
			{
				result[i] = 2;
			}
		}
		Sc.close();
		
		for(int i=0; i<n; i++)
		{
			if (result[i]==0) 
			{
				System.out.println("advertise");
			}
			else if(result[i]==1)
			{
				System.out.println("does not matter");
			}
			else
			{
				System.out.println("do not advertise");
			}
		}
	}
}