import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		int[] time = new int[n];
		
		for(int i=0; i<n; i++) {
			time[i] = stdIn.nextInt();
		}
		
		int minute = 0;
		int sum = 0;
		Arrays.sort(time);
		
		for(int i=0; i<n; i++) {
			minute += time[i];
			sum += minute;
		}
		System.out.print(sum);
	}
}