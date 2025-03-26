import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int K = Integer.parseInt(line.split(" ")[1]);

        for(int i = 0; i < N; i++) {
            line = br.readLine();

            for(int l = 0; l < K; l++) {
                for(int j = 0; j < N; j++) {
                    int value = Integer.parseInt(line.split(" ")[j]);

                    for(int k = 0; k < K; k++) {
                        System.out.print(value+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
