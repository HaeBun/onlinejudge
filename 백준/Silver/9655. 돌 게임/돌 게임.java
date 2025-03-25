import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        if(n%2==0) {
            System.out.println("CY");
        }
        else {
            System.out.println("SK");
        }
    }
}
