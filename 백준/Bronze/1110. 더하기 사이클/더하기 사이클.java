import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(addCycle(n,n/10, n%10, 0));
    }

    public static int addCycle(int num, int tens, int units, int count) {
        int result = tens + units;
        tens = units;
        units = result%10;

        if(num/10 == tens && num%10 == units)
            return ++count;
        else
            return addCycle(num, tens, units, ++count);
    }
}
