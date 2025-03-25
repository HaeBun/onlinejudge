import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            Stack stack = new Stack();
            Stack temp = new Stack();

            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < line.length(); j++) {
                switch (line.charAt(j)) {
                    case '<' :
                        if(!stack.isEmpty()) temp.push(stack.pop());
                        break;
                    case '>' :
                        if(!temp.isEmpty()) stack.push(temp.pop());
                        break;
                    case '-' :
                        if(!stack.isEmpty()) stack.pop();
                        break;
                    default:
                        stack.push(line.charAt(j));
                        break;
                }
            }
            while (! temp.isEmpty()) {
                stack.push(temp.pop());
            }

            for(int j = 0; j < stack.size(); j++) {
                sb.append(stack.elementAt(j));
            }
            System.out.println(sb.toString());
        }
    }
}