import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(br.readLine());

        for(int i = 0; i < T; i++) {
            int top = 0;

            String line = br.readLine();
            int length = Integer.valueOf(line.split(" ")[0]);

            for(int j = 0; j < length; j++) {
                int stack[] = new int[length];
                char ps = line.split(" ")[1].charAt(j);

                if(ps=='<') {
                    top--;
                    if(top < 0) break;
                } else {
                    stack[top] = 1;
                    top++;
                }

            }
            if(top==0) {
                System.out.println("legal");
            } else {
                System.out.println("illegal");
            }
        }
    }
}
