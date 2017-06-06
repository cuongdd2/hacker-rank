package interview;

import java.util.EmptyStackException;

/**
 * Created by cuongdd2@gmail.com on 03-Apr-17.
 */
public class MaxValue {

    public static void main(String[] args) {
//        String s = "100klh5gsdfgf64353444abc32342365bg";
//        System.out.println(maxNumber(s));

//        String s = "aabbab";
        String s = "abbaab";
        System.out.println(isValid(s));
    }

    static long maxNumber(String s) {
        long max = 0;
        char[] arr = s.toCharArray();
        int len = arr.length;
        String curr = "";
        for (int i = 0; i < len; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') curr += arr[i];
            else {
                if (curr == "") continue;
                long num = Long.parseLong(curr);
                curr = "";
                if (max < num) max = num;
            }
        }
        return max;
    }

    static boolean isValid(String s) {
        Stack stack = new Stack();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == 'a') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
class Stack {

    private Node tail;

    boolean isEmpty() {
        return tail == null;
    }

    void push(char c) {
        Node n = new Node(c);
        n.prev = tail;
        tail = n;
    }

    char pop() {
        if (tail == null) throw new EmptyStackException();
        char c = tail.data;
        tail = tail.prev;
        return c;
    }


    private class Node {
        char data;
//        Node next;
        Node prev;
        Node(char ch) {
            data = ch;
        }
    }

}
