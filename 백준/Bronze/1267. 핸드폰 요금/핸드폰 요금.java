import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        int y = 0;
        int m = 0;

        for(int i = 0; i < n; i++) {
            int time = stdIn.nextInt();
            y += ((time/30)+1) * 10;
            m += ((time/60)+1) * 15;
        }
        if(y>m) System.out.println("M "+ m);
        else if(y<m) System.out.println("Y "+ y);
        else System.out.println("Y M "+y);
    }
}
