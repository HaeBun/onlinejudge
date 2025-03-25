import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][3];

        int tempNumber;
        int tempCountry;
        int tempScore;
        int count = 2;

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }

        for(int i = 0; i < N-1; i++) {
            for(int j = 0; j < N-1; j++) {
                if(arr[j][2] < arr[j+1][2]) {
                    tempCountry = arr[j][0];
                    tempNumber = arr[j][1];
                    tempScore = arr[j][2];

                    arr[j][0] = arr[j+1][0];
                    arr[j][1] = arr[j+1][1];
                    arr[j][2] = arr[j+1][2];

                    arr[j+1][0] = tempCountry;
                    arr[j+1][1] = tempNumber;
                    arr[j+1][2] = tempScore;
                }
            }
        }
        for(int i = 0; i < 2; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }

        if(arr[0][0] == arr[1][0]) {
            while (arr[0][0] == arr[count][0]) {
                count++;
            }
        }
        System.out.println(arr[count][0]+" "+arr[count][1]);
    }
}
