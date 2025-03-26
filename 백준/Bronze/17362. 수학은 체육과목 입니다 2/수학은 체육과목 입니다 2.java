import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //수를 입력받음.
		int res = 0; // 결과
		
		n -= 1;
		n %= 8; // 수열 처리
		
		if(n==0) res=1;
		else if(n==1||n==7) res = 2;
		else if(n==2||n==6) res = 3;
		else if(n==3||n==5) res = 4;
		else res = 5;
		
		System.out.println(res);
	}
}