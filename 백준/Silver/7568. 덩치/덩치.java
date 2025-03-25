import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int arr[][] = new int[n][3];


        for(int i = 0; i < n; i++) {
            arr[i][0] = stdIn.nextInt();
            arr[i][1] = stdIn.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int rank = 1;
            for(int j = 0; j < n; j++) {
                if(arr[i][0] < arr[j][0]) {
                    if(arr[i][1] < arr[j][1]) {
                        rank++;
                    }
                }
            }
            arr[i][2] = rank;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i][2]+" ");
        }
    }
}
