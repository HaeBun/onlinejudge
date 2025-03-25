import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if(line.startsWith("0")) break;

            boolean result = false;
            for(int i = 0; i < line.length()/2; i++) {
                if(line.charAt(i) != line.charAt((line.length()-1)-i)) result = true;
            }
            System.out.println(result ? "no" : "yes");
        }
    }
}