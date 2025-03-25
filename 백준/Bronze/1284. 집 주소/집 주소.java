import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while (true) {
            int count = 0;
            String line = stdIn.nextLine();

            if (line.equals("0")) break;

            for(int i = 0; i < line.length(); i++) {
                count++;
                if(line.charAt(i)=='0')
                    count+=4;
                else if(line.charAt(i)=='1')
                    count+=2;
                else
                    count+=3;
            }
            count++;
            System.out.println(count);
        }

    }
}
