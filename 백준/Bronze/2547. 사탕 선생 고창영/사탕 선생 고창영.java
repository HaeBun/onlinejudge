import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        for(int i = 0; i < n; i++){
            int o = stdIn.nextInt();
            BigInteger b = new BigInteger("0");
            for(int j = 0; j < o; j++) {
                b = b.add(BigInteger.valueOf(stdIn.nextLong()));
            }
            if(b.remainder(BigInteger.valueOf(o)).compareTo(BigInteger.ZERO)==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
