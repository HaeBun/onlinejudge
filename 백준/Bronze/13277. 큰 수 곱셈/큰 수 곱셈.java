import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String[] array = Sc.nextLine().split(" ");

        System.out.println(new BigInteger(array[0]).multiply((new BigInteger(array[1]))));
    }
}