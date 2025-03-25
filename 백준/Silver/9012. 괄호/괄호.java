import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int T = Integer.parseInt(stdIn.nextLine());

        for(int i = 0; i < T; i++) {
            int top = 0;

            String line = stdIn.nextLine();
            int length = line.length();

            for(int j = 0; j < length; j++) {
                int stack[] = new int[length];
                char ps = line.charAt(j);

                if(ps==')') {
                    top--;
                    if(top < 0) break;
                } else {
                    stack[top] = 1;
                    top++;
                }

            }
            if(top==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
