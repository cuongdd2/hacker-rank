import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by cuongdd2@gmail.com on 28-Mar-17.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {

    private int n = 0;
    private int head = -1;
    private int tail = -1;
    private Item[] items = (Item[]) new Object[8];

    // construct an empty randomized queue
    public RandomizedQueue() {
    }

    // is the queue empty?
    public boolean isEmpty() {
        return tail == -1;
    }

    // return the number of items on the queue
    public int size() {
        return isEmpty() ? 0 : tail - head + 1;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) throw new NullPointerException();
        if (tail == items.length - 1) {
            resize(items.length * 2);
        }
        items[++tail] = item;
        n++;
        if (head == -1) head = 0;
    }

    // remove and return a random item
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        int idx = StdRandom.uniform(head, tail + 1);
        Item item = items[idx];
        for (int i = idx; i < tail; i++) {
            items[i] = items[i + 1];
        }
        items[tail--] = null;
        if (tail == -1) head = -1;
        return item;
    }

    // return (but do not remove) a random item
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException();
        return items[StdRandom.uniform(head, tail + 1)];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int current = head;
            @Override
            public boolean hasNext() {
                return current > -1 && current <= tail;
            }
            @Override
            public Item next() {
                if (!hasNext()) throw new NoSuchElementException();
                Item i = items[current];
                current++;// TODO: random next
                return i;
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    private void resize(int len) {
        Item[] arr = (Item[]) new Object[len];
        int idx = 0;
        for (int i = head; i <= tail; i++) {
            arr[idx++] = items[i];
        }
        items = arr;
    }

    // unit testing (optional)
    public static void main(String[] args) {

    }

}
