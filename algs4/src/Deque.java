import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by cuongdd2@gmail.com on 28-Mar-17.
 */
public class Deque<Item> implements Iterable<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int size;

    // construct an empty deque
    public Deque() {
        size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) throw new NullPointerException();
        Node<Item> n = new Node<>(item);
        n.next = first;
        if (first != null) first.prev = n;
        first = n;
        size++;
        if (size == 1) last = first;
    }

    // add the item to the end
    public void addLast(Item item) {
        if (item == null) throw new NullPointerException();
        Node<Item> n = new Node<>(item);
        n.prev = last;
        if (last != null) last.next = n;
        last = n;
        size++;
        if (size == 1) first = last;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        Item i = first.item;
        first = first.next;
        if (first != null) first.prev = null;
        size--;
        return i;
    }

    // remove and return the item from the end
    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        Item i = last.item;
        last = last.prev;
        size--;
        if (last != null) last.next = null;
        return i;
    }

    // return an iterator over items in order from front to end
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node<Item> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public Item next() {
                if (!hasNext()) throw new NoSuchElementException();
                Item i = current.item;
                current = current.next;
                return i;
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    // unit testing (optional)
    public static void main(String[] args) {

    }

    private class Node<A> {
        private A item;
        private Node<A> next;
        private Node<A> prev;

        Node(A a) {
            item = a;
        }
    }
}

