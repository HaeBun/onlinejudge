import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		
		B += C;
		
		A += B/60;
		B %= 60;
		A %= 24;
		
		System.out.println(A+" "+B);
		
	}
}