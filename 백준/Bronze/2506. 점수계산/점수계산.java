import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int total = 0, count = 0;
		
		for(int i=0; i<n; i++) {
			if(stdIn.nextInt()==1) {
				count++;
				total += count;
			}
			else {
				count = 0;
			}
		}
		System.out.println(total);
	}
}