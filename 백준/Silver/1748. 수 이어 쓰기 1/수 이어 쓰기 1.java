import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        
        int multiple = 1;
        int count = 0;
        int sum = 0;

        while (n >= multiple) {
            sum = sum + (multiple - multiple / 10) * count;
            multiple = multiple * 10;
            count++;
        }

        n = n - (multiple / 10 - 1);

        sum = sum + n * count;

        System.out.println(sum);
    }
}