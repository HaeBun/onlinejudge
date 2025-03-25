import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int num;

    @Override
    public int compareTo(Node node) {
        if(node.num < num)
            return 1;
        else if(node.num > num)
            return -1;
        return 0;
    }

    public Node(int num) {
        this.num = num;
    }

    ArrayList<Node> link = new ArrayList<>();
}

public class Main {
    static List<Node> queue;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int v = scanner.nextInt();

        Node[] field = new Node[n + 1];
        field[v] = new Node(v);
        Node root = field[v];

        queue = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();

            if(input1 > input2) {
                int temp = input1;
                input1 = input2;
                input2 = temp;
            }

            if(field[input1] == null)
                field[input1] = new Node(input1);

            if(field[input2] == null)
                field[input2] = new Node(input2);

            if(field[input1].link.indexOf(field[input2]) == -1)
                field[input1].link.add(field[input2]);

            if(field[input2].link.indexOf(field[input1]) == -1)
                field[input2].link.add(field[input1]);
        }
        
        dfs(root);
        System.out.println();
        queue.clear();
        bfs(root);
    }

    public static void dfs(Node node) {
        System.out.print(node.num +" ");
        queue.add(node);
        Collections.sort(node.link);
        for(int i = 0; i < node.link.size(); i++) {
            if(queue.indexOf(node.link.get(i)) == - 1)
                dfs(node.link.get(i));
        }
    }

    public static void bfs(Node node) {
        System.out.print(node.num +" ");

        if(queue.indexOf(node) == - 1)
            queue.add(node);

        for(int i = 0; i < node.link.size(); i++) {
            if(queue.indexOf(node.link.get(i)) == -1)
                queue.add(node.link.get(i));
        }

        int next = queue.indexOf(node) + 1;
        if(next == queue.size())
            return;

        bfs(queue.get(next));
    }
}
