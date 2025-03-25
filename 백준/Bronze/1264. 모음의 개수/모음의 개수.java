import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] Vowel = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };
        for(;;){
            String L = stdIn.nextLine();
            int count = 0;

            if(!L.equals("#")) {
                for(int i = 0; i < L.length(); i++){
                    for(int j = 0; j < Vowel.length; j++){
                        if(L.split("")[i].equals(Vowel[j])) count++;
                    }
                }
                System.out.println(count);

            } else break;
        }
    }
}
