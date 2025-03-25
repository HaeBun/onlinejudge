import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Dot implements Comparable<Dot> {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Dot dot) {
        if(dot.x < this.x)
            return 1;
        else if(dot.x > this.x)
            return -1;
        else {
            if(dot.y < this.y)
                return 1;
            else if(dot.y > this.y)
                return -1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        Dot[] array = new Dot[n];

        for(int i = 0; i < n; i++) {
            String line = bufferedReader.readLine();
            int x = Integer.parseInt(line.split(" ")[0]);
            int y = Integer.parseInt(line.split(" ")[1]);

            array[i] = new Dot(x, y);
        }

        Arrays.sort(array);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < n; i++) {
            stringBuilder.append(array[i].x +" " + array[i].y).append('\n');
        }

        System.out.print(stringBuilder);
    }
}
