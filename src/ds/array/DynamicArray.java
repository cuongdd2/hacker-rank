package ds.array;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 02-Apr-17.
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        Seq[] seqList = new Seq[N];
        for (int i = 0; i < N; i++) {
            seqList[i] = new Seq();
        }
        int lastAns = 0;
        for (int i = 0; i < Q; i++) {
            int type = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            int idx = (x ^ lastAns) % N;
            Seq seq = seqList[idx];
            if (type == 1) {
                seq.add(y);
            } else {
                lastAns = seq.get(y % seq.size);
                System.out.println(lastAns);
            }
        }
    }

    private static class Seq {
        private int size;
        private int[] data;

        public Seq() {
            data = new int[8];
        }

        void add(int e) {
            if (size == data.length) resize();
            data[size++] = e;
        }

        int get(int i) {
            return data[i];
        }

        void resize() {
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }
        }
    }
}
