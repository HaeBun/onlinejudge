import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList list = new ArrayList();
    static boolean field[][];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        field = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            String line = bufferedReader.readLine();
            for(int j = 0; j < n; j++) {
                if(line.charAt(j) == '1')
                    field[i][j] = true;
                else
                    field[i][j] = false;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(field[i][j])
                    list.add(find(i, j));
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static int find(int i, int j) {
        if(i < 0 || j < 0 || i >= field.length || j >= field[0].length)
            return 0;
        if(field[i][j] == false)
            return 0;

        field[i][j] = false;
        int count = 1;

        count += find(i + 1, j)
                +find(i - 1, j)
                +find(i, j + 1)
                +find(i, j - 1);

        return count;
    }
}
