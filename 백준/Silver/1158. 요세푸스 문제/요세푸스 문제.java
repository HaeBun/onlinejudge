import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Queue {
    public int max;         // 큐 크기
    public int num = 0;
    public int front;       // 첫 번째 요소 커서
    public int rear;        // 마지막 요소 커서
    public int[] que;       // 큐 본체

    public Queue(int size) {
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
        if (!isFull()) {
            que[rear] = value;
            rear = (rear + 1) % max;
            num++;
        }

    }

    public int deQueue() {
        if (!isEmpty()) {
            int result = que[front];
            front = (front + 1) % max;
            num--;

            return result;
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int K = Integer.parseInt(line.split(" ")[1]);

        Queue queue = new Queue(N);

        for(int i = 0; i < N; i++) {
            queue.enQueue(i+1);
        }

        int count = 1;
        System.out.print("<");
        for(int i = 1; i < N;) {
            if(count % K == 0) {
                System.out.print(queue.deQueue()+", ");
                i++;
                count = 1;
                continue;
            }
            int temp = queue.deQueue();
            queue.enQueue(temp);
            count++;
        }
        System.out.print(queue.deQueue()+">");
    }
}