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
    int size = 0;
    public DoubleEndedQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void insertFront(int value) {
        DequeNode node = new DequeNode();
        node.data = value;
        if(front == null) {
            front = node;
            rear = node;
        }
        else {
            front.lLink = node;
            node.rLink = front;
            node.lLink = null;
            front = node;
        }
        size++;
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
        size++;
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
            size--;
        }
    }

    public void deleteRear() {
        if(! isEmpty()) {
            if(rear.lLink == null) {
                rear = null;
                front = null;
            }
            else {
                rear = rear.lLink;
                rear.rLink = null;
            }
            size--;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        DoubleEndedQueue deq = new DoubleEndedQueue();
        for(int i = 0; i < n; i++) {
            String line = br.readLine();

            if(line.startsWith("push_front")) {
                deq.insertFront(Integer.parseInt(line.split(" ")[1]));
            }
            else if(line.startsWith("push_back")) {
                deq.insertRear(Integer.parseInt(line.split(" ")[1]));
            }
            else if(line.startsWith("pop_front")) {
                if(deq.front != null) {
                    System.out.println(deq.front.data);
                    deq.deleteFront();
                }
                else {
                    System.out.println(-1);
                }
            }
            else if(line.startsWith("pop_back")) {
                if(deq.rear != null) {
                    System.out.println(deq.rear.data);
                    deq.deleteRear();
                }
                else {
                    System.out.println(-1);
                }
            }
            else if(line.startsWith("empty")) {
                System.out.println(deq.isEmpty() ? 1 : 0);
            }
            else if(line.startsWith("size")) {
                System.out.println(deq.size);
            }
            else if(line.startsWith("front")) {
                if(deq.front != null) {
                    System.out.println(deq.front.data);
                }
                else {
                    System.out.println(-1);
                }

            }
            else if(line.startsWith("back")) {
                if(deq.rear != null) {
                    System.out.println(deq.rear.data);
                }
                else {
                    System.out.println(-1);
                }
            }
        }
    }
}
