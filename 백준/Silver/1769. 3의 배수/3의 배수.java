import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String line = stdIn.nextLine();
        int n = 0;
        int count = 0;
        if(line.length()>1) count++;

        for(int i = 0; i < line.length(); i++) {
            n += Integer.valueOf(line.charAt(i)-48);
        }
        int y = n;

        while (y>9) { // 즉, 2자릿수일 때,
            n = 0;
            String line2 = String.valueOf(y);
            for(int i = 0; i <line2.length(); i++) {
                n += Integer.valueOf(line2.charAt(i)-48);
            }
            y = n;
            count++;
        }

        System.out.println(count);
        if(y % 3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
