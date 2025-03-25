import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public int max;         // 큐 크기
    public int num = 0;
    public int front;       // 첫 번째 요소 커서
    public int rear;        // 마지막 요소 커서
    public int[] que;       // 큐 본체

    public Main(int size) {
        this.max = size;
        this.front = 0;
        this.rear = 0;
        this.que = new int[size];
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void enQueue(int value) {
        if(! isFull()) {
            que[rear] = value;
            rear = (rear + 1) % max;
            num++;
        }
    }

    public void deQueue() {
        if(! isEmpty()) {
            System.out.println(que[front]);
            front = (front + 1) % max;
            num--;
        }
        else System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        Main que = new Main(n);

        for(int i = 0; i < n; i++) {
            String line = br.readLine();

            if(line.startsWith("push")) {
                que.enQueue(Integer.valueOf(line.split(" ")[1]));
            }
            else if(line.startsWith("pop")) {
                que.deQueue();
            }
            else if(line.startsWith("size")) {
                System.out.println(que.num);
            }
            else if(line.startsWith("empty")) {
                System.out.println(que.isEmpty() ? 1 : 0);
            }
            else if(line.startsWith("front")) {
                if(que.num == 0) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(que.que[que.front]);
                }
            }
            else if(line.startsWith("back")) {
                if(que.num == 0) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(que.que[que.rear-1]);
                }
            }
        }
    }
}