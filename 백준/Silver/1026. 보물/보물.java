import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int A[] = new int[n];
        Integer B[] = new Integer[n];

        String line1 = br.readLine();
        String line2 = br.readLine();

        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(line1.split(" ")[i]);
            B[i] = Integer.parseInt(line2.split(" ")[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());

        int result = 0;
        for(int i = 0; i < n; i++) {
            result += A[i]*B[i];
        }

        System.out.println(result);
    }
}
