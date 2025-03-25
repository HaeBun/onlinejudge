import java.util.Scanner;

public class Main {
    static int widthSize;
    static int heightSize;
    static boolean[][] field;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            widthSize = scanner.nextInt();
            heightSize = scanner.nextInt();
            int C = scanner.nextInt();
            field = new boolean[heightSize][widthSize];
            int count = 0;

            for(int j = 0; j < C; j++) {
                int numWidth = scanner.nextInt();
                int numHeight = scanner.nextInt();

                field[numHeight][numWidth] = true;
            }

            for(int j = 0; j < heightSize; j++) {
                for(int k = 0; k < widthSize; k++) {
                    if(field[j][k] == true) {
                        count++;
                        find(j, k);
                    }
                }
            }

            System.out.println(count);
        }
    }
    public static void find(int height, int width) {
        if(width < 0 || height < 0 ||
                width >= widthSize || height >= heightSize)
            return;

        if(field[height][width] == false)
            return;

        field[height][width] = false;

        find(height,width + 1);
        find(height,width - 1);
        find(height + 1,width);
        find(height - 1,width);
    }
}
