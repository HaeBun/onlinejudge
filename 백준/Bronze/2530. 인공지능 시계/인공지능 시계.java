import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A=s.nextInt(), B=s.nextInt(), C=s.nextInt()+s.nextInt();
		B += C/60;
		A += B/60;
		System.out.println(A%24+" "+(B%60)+" "+C%60);
	}
}