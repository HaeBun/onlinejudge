import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String line = Sc.nextLine();
		
		int wordCount = 0;
		String a[] = line.split(" ");
		
		for(int i=0; i<a.length; i++) 
		{
			if(!a[i].equalsIgnoreCase(""))
			{
				wordCount++;
			}
		}
		
		System.out.println(wordCount);
		
	}
}