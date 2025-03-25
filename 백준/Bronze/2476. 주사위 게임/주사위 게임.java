import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] arr = new int[3];

        int max_price = 0;

        for(int i=0; i < n; i++){
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                arr[j] = stdIn.nextInt();
            }
            Arrays.sort(arr);

            if (arr[0] == arr[1] && arr[1] == arr[2])
                sum = (10000 + (arr[0] * 1000));
            else if (arr[0] == arr[1] || arr[1] == arr[2])
                sum = (1000 + (arr[1] * 100));
            else
                sum = (arr[2] * 100);

            if(max_price<sum)
                max_price = sum;
        }
        System.out.println(max_price);
    }
}
