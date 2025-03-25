import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            String line = br.readLine();
            int n = Integer.parseInt(line.split(" ")[0]);
            int arr[] = new int[n];
            int gap = 0;

            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(line.split(" ")[j+1]);
            }

            Arrays.sort(arr);

            for(int j = 0; j < n-1; j++) {
                if(gap < arr[j+1]-arr[j]) gap = arr[j+1]-arr[j];
            }

            System.out.printf("Class %d\n", (i+1));
            System.out.printf("Max %d, Min %d, Largest gap %d\n", arr[n-1], arr[0], gap);
        }
    }
}