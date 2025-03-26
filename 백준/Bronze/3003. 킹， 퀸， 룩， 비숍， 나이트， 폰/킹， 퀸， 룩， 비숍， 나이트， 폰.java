import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] array = new int[6];
        int[] value = { 1, 1, 2, 2, 2, 8 };

        for(int i = 0; i < 6; i++){
            array[i] = stdIn.nextInt();
        }

        for(int i = 0; i < 6; i++){
            System.out.printf("%d ",value[i]-array[i]);
        }

    }
}
