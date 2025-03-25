import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String result = new String();
        Stack stack = new Stack();
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            switch (c) {
                case '(' :
                    stack.push(c);
                    break;
                case ')' :
                    while (! stack.isEmpty()) {
                        if(stack.peek().equals('(')) {
                            stack.pop();
                            break;
                        }
                        else {
                            result += stack.pop();
                        }
                    }
                    break;

                case '+' :
                case '-' :
                    while (! stack.isEmpty() && !stack.peek().equals('(')) {
                            result += stack.pop();
                    }
                case '*' :
                case '/' :
                    while (! stack.isEmpty() && (stack.peek().equals('*') || stack.peek().equals('/'))) {
                            result += stack.pop();
                    }
                    stack.push(c);
                    break;

                default :
                    result += c;
                    break;
            }
        }
        while (! stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.print(result);
    }
}
