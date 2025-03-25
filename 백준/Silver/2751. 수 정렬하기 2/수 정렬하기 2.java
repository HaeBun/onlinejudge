import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Number implements Comparable<Number> {
    int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Number number) {
        if(this.num < number.num) {
            return -1;
        }
        else if(this.num > number.num) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        Number[] numbers = new Number[n];

        for(int i = 0 ; i < n; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            numbers[i] = new Number(num);
        }

        Arrays.sort(numbers);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < n; i++) {
            stringBuilder.append(numbers[i].num).append('\n');
        }

        System.out.print(stringBuilder);
    }
}
