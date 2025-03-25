import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String A = stdIn.next();
		String B = stdIn.next();
		
		String splA[] = A.split("");
		String splB[] = B.split("");
		
		long sumA = 0, sumB = 0;
		for(int i = 0; i < A.length(); i++) 
		{
			sumA +=Integer.parseInt(splA[i]);
		}
		
		for(int i = 0; i < B.length(); i++)
		{
			sumB += Integer.parseInt(splB[i]);
		}
		
		System.out.println(sumA * sumB);
	}
}