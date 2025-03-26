import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];

        boolean isAscending = true;
        boolean isDescending = true;

        for(int i = 0; i < 8; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < 7; i++) {
            if(isAscending) {
                if(! (array[i] < array[i+1]))
                    isAscending = false;
            }

            if(isDescending) {
                if(! (array[i] > array[i+1]))
                    isDescending = false;
            }
        }

        if(!isAscending && !isDescending) {
            System.out.println("mixed");
        }
        else if(isAscending) {
            System.out.println("ascending");
        }
        else if(isDescending) {
            System.out.println("descending");
        }
    }
}