import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String n = stdIn.nextLine();
		
		System.out.println(Integer.parseInt(n, 16));
	}
}