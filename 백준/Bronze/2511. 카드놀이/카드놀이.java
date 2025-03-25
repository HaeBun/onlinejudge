import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int a_score = 0;
        int b_score = 0;
        int p = 0;

        for(int i = 0; i < 10; i++)
            a[i] = stdIn.nextInt();
        for(int i = 0; i < 10; i++)
            b[i] = stdIn.nextInt();

        for(int i = 0; i < 10; i++) {
             if(a[i] > b[i]) {
                 a_score += 3;
                 p = 0;
             }
             else if(a[i] < b[i]) {
                 b_score += 3;
                 p = 1;
             }
             else {
                 a_score++;
                 b_score++;
             }
        }
        System.out.println(a_score + " " + b_score);

        if(a_score > b_score) {
            System.out.println("A");
        } else if(a_score < b_score) {
            System.out.println("B");
        } else if(a_score == 10 || b_score == 10) {
            System.out.println("D");
        } else {
            System.out.println((char)('A'+p));
        }
    }
}
