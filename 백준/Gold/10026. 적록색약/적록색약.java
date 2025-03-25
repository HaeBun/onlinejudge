import java.util.Scanner;

class Node {
    char color;
    boolean isVisited = false;

    public Node(char color) {
        this.color = color;
    }

    @Override
    protected Node clone() {
        return new Node(color);
    }
}

public class Main {
    static int n;
    static int visit = 0;
    static int blindVisit = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());

        Node[][] grid = new Node[n][n];
        Node[][] redGreedBlindGrid = new Node[n][n];

        for(int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for(int j = 0; j < n; j++) {
                grid[i][j] = new Node(line.charAt(j));

                if(grid[i][j].color == 'G' || grid[i][j].color == 'R')
                    redGreedBlindGrid[i][j] = new Node('A');
                else
                    redGreedBlindGrid[i][j] = grid[i][j].clone();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(! grid[i][j].isVisited) {
                    visit++;
                    findArea(grid, i, j);
                }

                if(! redGreedBlindGrid[i][j].isVisited) {
                    blindVisit++;
                    findArea(redGreedBlindGrid, i, j);
                }
            }
        }

        System.out.println(visit + " " + blindVisit);
    }


    public static void findArea(Node[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= n || j >= n)
            return;

        grid[i][j].isVisited = true;
        char color = grid[i][j].color;


        if(i + 1 < n)
            if(color == grid[i + 1][j].color && !grid[i + 1][j].isVisited)
                findArea(grid, i + 1, j);

        if(j + 1 < n)
            if(color == grid[i][j + 1].color && !grid[i][j + 1].isVisited)
                findArea(grid, i, j + 1);

        if(i - 1 >= 0)
            if(color == grid[i - 1][j].color && !grid[i - 1][j].isVisited)
                findArea(grid,i - 1, j);

        if(j - 1 >= 0)
            if(color == grid[i][j - 1].color && !grid[i][j - 1].isVisited)
                findArea(grid,i, j - 1);
    }
}