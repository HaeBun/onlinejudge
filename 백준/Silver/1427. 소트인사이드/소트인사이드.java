import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String n = stdIn.next();

        char[] array = new char[n.length()];

        for(int i=0; i<n.length(); i++){
            array[i] = n.charAt(i);
        }

        Arrays.sort(array);

        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]);
        }
    }
}