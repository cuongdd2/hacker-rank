package code;

/**
 * Created by cuongdd2@gmail.com on 02-Apr-17.
 */
public class Day18 {
    Stack stack = new Stack();
    Queue queue = new Queue();

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.enqueue(ch);
    }
    char popCharacter() {
        return stack.pop();
    }
    char dequeueCharacter() {
        return queue.dequeue();
    }

    private class Stack {
        Node tail;

        void push(char c) {
            Node n = new Node(c);
            if (tail == null) {
                tail = n;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }

        char pop() {
            char c = tail.data;
            tail = tail.prev;
            return c;
        }
    }

    private class Queue {
        Node head;
        Node tail;

        void enqueue(char c) {
            Node n = new Node(c);
            if (tail == null) {
                head = tail = n;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }

        char dequeue() {
            char c = head.data;
            head = head.next;
            head.prev = null;
            return c;
        }

    }

    private class Node {
        char data;
        Node next;
        Node prev;
        Node(char c) {
            data = c;
        }
    }

}
