import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);

		int a[] = new int[3];
		
		for(int i=0; i<3; i++) {
			a[i] = Sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println(a[2]+a[1]);
		
	}
}