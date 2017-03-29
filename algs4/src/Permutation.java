import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by cuongdd2@gmail.com on 28-Mar-17.
 */
public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        String s;
        RandomizedQueue<String> rq = new RandomizedQueue<>();
        while ((s = StdIn.readString()) != null) {
            rq.enqueue(s);
        }
        for (int i = 0; i < k; i++) {
            StdOut.println(rq.dequeue());
        }
    }
}
