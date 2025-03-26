import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String A = stdIn.next();
        String B = stdIn.next();

        String min_A = "";
        String min_B = "";

        String max_A = "";
        String max_B = "";

        int min = 0;
        int max = 0;

        for(int i = 0; i < A.length(); i++) { // A의 5와 6의 케이스를 나눔
            if(A.charAt(i)=='5' || A.charAt(i)=='6') {
                min_A += '5';
                max_A += '6';
            }
            else {
                min_A += A.charAt(i);
                max_A += A.charAt(i);
            }
        }

        for(int i = 0; i < B.length(); i++) {
            if(B.charAt(i)=='5' || B.charAt(i)=='6') {
                min_B += '5';
                max_B += '6';
            }
            else {
                min_B += B.charAt(i);
                max_B += B.charAt(i);
            }
        }

        min = Integer.valueOf(min_A) + Integer.valueOf(min_B);
        max = Integer.valueOf(max_A) + Integer.valueOf(max_B);

        System.out.println(min +" "+ max);
    }
}
