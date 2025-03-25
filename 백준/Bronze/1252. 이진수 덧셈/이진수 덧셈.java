import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String line = stdIn.nextLine();

        BigInteger a = new BigInteger(line.split(" ")[0], 2);
        BigInteger b = new BigInteger(line.split(" ")[1],2);

        System.out.println(a.add(b).toString(2));
    }
}
