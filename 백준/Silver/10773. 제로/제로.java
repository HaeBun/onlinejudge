import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int k = stdIn.nextInt();
        int top = 0;
        int stack[] = new int[k];
        int sum = 0;
        for(int i = 0; i < k; i++) {
            int num = stdIn.nextInt();
            if(num != 0) {
                stack[top] = num;
                top++;
            }
            else top--;
        }

        for(int i = 0; i < top; i++) {
            sum += stack[i];
        }
        System.out.println(sum);
    }
}