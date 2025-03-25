import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		for(int i=1; i<=n*2-1; i++) {
			
			int a = n*2-1; //5를 넣으면 9, 6을 넣으면 11 
			int b = i*2-1; //1 3 5 7 9	a와b는 별 찍는 데 관여함. 
			
			if(i<=n)
			{
				for(int j=1; j<i; j++) {
					System.out.print(" ");
				}
				
				for(int j=a; j>=b; j--) { // 홀수개 별 생산
					System.out.print("*");
				}
			}
			else 
			{ 
				for(int j=i; j<n*2-1; j++) {
					System.out.print(" ");
				}
				
				for(int j=b; j>=a; j--) 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}