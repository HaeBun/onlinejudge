import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        do {
            String line = stdIn.nextLine();
            char stack[] = new char[line.length()];
            int top = 0;
            if(line.equals(".")) break;

            for(int i = 0; i < line.length(); i++) {

                if(line.charAt(i)=='(' || line.charAt(i)==')' || line.charAt(i)=='[' || line.charAt(i)==']') { // 괄호 스택 쌓기
                    stack[top] = line.charAt(i);
                    if(top > 0) {
                        if(stack[top-1]=='(' && stack[top]==')') { // 괄호가 짝이 맞으면 ( )
                            top --;
                            continue;
                        }

                        if(stack[top-1]=='[' && stack[top]==']') { // 괄호 스택 쌓기
                            top --;
                            continue;
                        }
                    }
                    top++;
                }
            }
            if(top==0) System.out.println("yes");
            else System.out.println("no");
        } while (true);
    }
}
