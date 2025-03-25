import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int result = 0;
		int value;
		for(int i = 0; i<5; i++) {
			value = stdIn.nextInt();
			value *= value;
			result += value;
		}
		System.out.println(result%10);
	}
}