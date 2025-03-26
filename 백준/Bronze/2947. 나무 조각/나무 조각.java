import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int arr[] = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(line.split(" ")[i]);
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    for(int k = 0; k < 5; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
