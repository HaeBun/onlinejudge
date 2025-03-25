import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = 0;
        for(int i=0; i < 8; i++){
            String L = stdIn.nextLine();

            for(int j=0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (L.split("")[j].equals("F")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
