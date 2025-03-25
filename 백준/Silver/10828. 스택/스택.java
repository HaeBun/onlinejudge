import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        int n = Integer.valueOf(br.readLine());

        for(int i = 0; i < n; i++) {
            String line = br.readLine();

            switch (line.split(" ")[0])
            {
                case "push" :
                    stack.push(line.split(" ")[1]);
                    break;
                case "pop" :
                    if(stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "top" :
                    if(stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.peek());
                    }
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
            }
        }
    }
}