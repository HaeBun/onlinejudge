import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String word = stdIn.next();
		int[] alphabet = new int[26];
		int max = 0;
		char result = '?';
		
		for(int i=0; i<word.length(); i++) 
		{
			int n = word.charAt(i);
			if(n>96) n -= 32; // 소문자 -> 대문자 char형으로 바꿔 계산
			
			alphabet[n-65] += 1;
		}

		for(int i = 0; i < 26; i++) {
			if(max < alphabet[i]) {
				result = (char) (i+65);
				max = alphabet[i];
			}
			else if(max == alphabet[i])
				result = '?';
			
		}
		System.out.println(result);
	}
}