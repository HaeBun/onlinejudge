import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DequeNode {
    int data;
    DequeNode lLink;
    DequeNode rLink;
}

class DoubleEndedQueue {
    DequeNode front;
    DequeNode rear;

    public DoubleEndedQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void insertRear(int value) {
        DequeNode node = new DequeNode();
        node.data = value;
        if(rear == null) {
            rear = node;
            front = node;
        }
        else {
            rear.rLink = node;
            node.lLink = rear;
            node.rLink = null;
            rear = node;
        }
    }

    public void deleteFront() {
        if(! isEmpty()) {
            if(front.rLink == null) {
                front = null;
                rear = null;
            }
            else {
                front = front.rLink;
                front.lLink = null;
            }
        }
    }

    public int front_value() {
        return front.data;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        DoubleEndedQueue deq = new DoubleEndedQueue();

        for(int i = 1; i <= n; i++) {
            deq.insertRear(i);
        }

        int count = 1;

        while (deq.front != null) {
            if(count%2 == 0) {
                deq.insertRear(deq.front_value());
                deq.deleteFront();
            }
            else {
                System.out.print(deq.front_value()+" ");
                deq.deleteFront();
            }
            count++;
        }
    }
}