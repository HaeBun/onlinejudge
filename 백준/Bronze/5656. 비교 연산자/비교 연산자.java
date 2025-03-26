import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int T = 1;
        for(;;){
            String L = stdIn.nextLine();
            int a = Integer.parseInt(L.split(" ")[0]);
            int b = Integer.parseInt(L.split(" ")[2]);
            String symbol = L.split(" ")[1];
            if(! symbol.equals("E")){
                if(symbol.equals(">"))
                    System.out.println("Case "+T+": "+Boolean.toString(a>b));
                else if(symbol.equals(">="))
                    System.out.println("Case "+T+": "+Boolean.toString(a>=b));
                else if(symbol.equals("<"))
                    System.out.println("Case "+T+": "+Boolean.toString(a<b));
                else if(symbol.equals("<="))
                    System.out.println("Case "+T+": "+Boolean.toString(a<=b));
                else if(symbol.equals("=="))
                    System.out.println("Case "+T+": "+Boolean.toString(a==b));
                else
                    System.out.println("Case "+T+": "+Boolean.toString(a!=b));

                T++;
            } else break;
        }
    }
}
