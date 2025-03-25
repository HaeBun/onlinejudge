import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		long a = Sc.nextLong();
		long count =0;
		int pls = 1;
		
		for(int i=0; i<1;) 
		{	
			if(count<=a) {
				count += pls;
				pls++;
			}
			else {
				System.out.println(pls-2);
				i++;
			}
			
		}
	}
}