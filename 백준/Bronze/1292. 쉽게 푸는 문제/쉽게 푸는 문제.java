import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int start = stdIn.nextInt();
		int end = stdIn.nextInt();
		int count = 0;
		int res=0;
		
		for(int i=1; i<46; i++) {			
			for(int j=0; j<i; j++) {
				count++;
				if(count>=start&&count<=end) {
					res += i;
				}
				else if(count>end) {
					i=46;
					break;
				}
			}
		}
		System.out.println(res);
	}
}