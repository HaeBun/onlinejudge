import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        
        int zero = ( n/5 ) + ( n/25 ) + ( n/125 );
        
        System.out.println(zero);
	}
}