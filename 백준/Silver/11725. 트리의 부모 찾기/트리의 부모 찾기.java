import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;

    static boolean[] isVisit;
    static ArrayList<Integer>[] list;
    static int[] parents;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        list = new ArrayList[n + 1];
        parents = new int[n + 1];
        isVisit = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i < n ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 1; i <=n ; i++) {
            if(!isVisit[i]) {
                dfs(i);
            }
        }
        for (int i = 2; i <=n ; i++) {
            System.out.println(parents[i]);
        }
    }

    private static void dfs(int v){
        if(isVisit[v]){
            return;
        }
        isVisit[v] =true;

        for (int num: list[v]) {
            if(!isVisit[num]){
                parents[num] = v;
                dfs(num);
            }
        }
    }
}