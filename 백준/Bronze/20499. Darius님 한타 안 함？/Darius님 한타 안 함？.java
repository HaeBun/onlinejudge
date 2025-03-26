import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String line = stdIn.nextLine();
        int K = Integer.valueOf(line.split("/")[0]);
        int D = Integer.valueOf(line.split("/")[1]);
        int A = Integer.valueOf(line.split("/")[2]);

        if(K+A < D || D == 0) System.out.println("hasu");
        else System.out.println("gosu");
    }
}
