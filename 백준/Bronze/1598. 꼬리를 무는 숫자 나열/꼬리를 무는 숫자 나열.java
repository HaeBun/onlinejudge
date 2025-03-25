import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt()-1;
        int b = stdIn.nextInt()-1;

        int res = 0;
        if(a%4 >= b%4)
            res = (a%4 - b%4);
        else
            res = (b%4 - a%4);

        if(a >= b)
            res += ((a/4)+1)-((b/4) + 1);
        else
            res += ((b/4)+1)-((a/4) + 1);

        System.out.println(res);
    }
}
