import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int length = line.length();
        int top = 0;
        int pipes = 0;

        int stack[] = new int[length];

        for(int i = 0; i < length; i++) {
            if(line.charAt(i) == '(') {
                stack[top] = i;
                top++;
            }
            else {
                if(line.charAt(i-1) == ')') {
                    pipes++;
                    top--;
                }
                else {
                    pipes += --top;
                }
            }
        }
        System.out.println(pipes);
    }
}