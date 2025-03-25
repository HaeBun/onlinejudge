import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String line = stdIn.nextLine();
        int length = line.length();
        int arrNum[] = new int[9];
        int min = -1;
        for(int i = 0; i < 9; i++)
            arrNum[i] = 0;

        for(int i = 0; i < length; i++) {
            int number = Integer.parseInt(line.split("")[i]);
            if(number!=9)
                arrNum[number]++;
            else
                arrNum[6]++;
        }

        for(int i = 0; i< 9; i++) {
            if(i != 6) {
                if(arrNum[i] > min) min = arrNum[i];
            }
            else {
                if(arrNum[i] > min) {
                    if (arrNum[6] % 2 != 0) min = arrNum[6] / 2 + 1;
                    else min = arrNum[6] / 2;
                }
            }
        }
        System.out.println(min);
    }
}