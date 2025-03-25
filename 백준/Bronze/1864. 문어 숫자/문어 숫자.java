import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char a[] = { '/', '-', '\\', '(', '@', '?', '>', '&', '%' };


        do {
            String line = stdIn.nextLine();

            int l = line.length();
            int result = 0;
            if(line.charAt(0)=='#') break;

            for(int i = 0; i < line.length(); i++) { 

                for(int j = 0; j < a.length; j++) { // 비교횟수
                    if(line.charAt(i)==a[j]) {
                        result += (j-1) * Math.pow(8, --l);
                    }
                }

            }
            System.out.println(result);
        } while (true);
    }
}
