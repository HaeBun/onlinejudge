import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[][] a = new int[101][101];
        int x1, x2, y1, y2;

        for (int i = 0; i < 4; i++) {
            x1 = stdIn.nextInt();
            y1 = stdIn.nextInt();
            x2 = stdIn.nextInt();
            y2 = stdIn.nextInt();


            for (int x = x2; x>x1; x--) {
                for (int y = y2; y>y1; y--) {
                    a[x][y] = 1;
                }
            }

        }
        int count = 0;
        for (int x = 0; x<=100; x++) {
            for (int y = 0; y<=100; y++) {
                if(a[x][y]==1)
                    count++;
            }
        }
        System.out.println(count);
    }
}