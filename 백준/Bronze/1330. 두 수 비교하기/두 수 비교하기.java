import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}
		
		else if(a<b) {
			System.out.println("<");
		}
		
		else {
			System.out.println("==");
		}
	}
}