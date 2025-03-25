import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        Queue queue = new Queue(n);

        for(int i = 0; i < n; i++) {
            queue.enQueue(i+1);
        }

        for(int i = 1; i < n; i++) {
            queue.deQueue();
            int temp = queue.deQueue();
            queue.enQueue(temp);
        }
        System.out.println(queue.deQueue());

    }
}