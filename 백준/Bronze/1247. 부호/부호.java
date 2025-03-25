import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        for(int i=0; i < 3; i++){
            int n = stdIn.nextInt();
            BigInteger a = new BigInteger("0");
            for(int j=0; j < n; j++){
                a = a.add(BigInteger.valueOf(stdIn.nextLong()));
            }
            if(a.compareTo(BigInteger.ZERO) == 1){
                System.out.println('+');
            } else if (a.compareTo(BigInteger.ZERO) == -1){
                System.out.println('-');
            } else{
                System.out.println("0");
            }

        }
    }
}