import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int chk = 0;

        while(N>0){
            chk++;

            if(String.valueOf(chk).contains("666")){
                N--;
            }
        }
        System.out.println(chk);
    }
}