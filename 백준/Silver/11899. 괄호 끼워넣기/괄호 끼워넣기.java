import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String line = stdIn.nextLine();
        char stack[] = new char[line.length()];
        int top = 0;
        for(int i = 0; i < line.length(); i++) {
            stack[top] = line.charAt(i);
            if(top > 0) {
                if(stack[top-1]=='(' && stack[top]==')') {
                    top--;
                    continue;
                }
            }
            top++;
        }
        System.out.println(top);
    }
}