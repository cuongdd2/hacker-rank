package ds.tree;

import java.util.Random;

/**
 * Created by cuongdd2@gmail.com on 03-Apr-17.
 */
public class PreorderTraversal {

    public static void main(String[] args) {
        Node root = new Node(99);
        Node n = root;
        for (int i = 0; i < 3; i++) {
            Node left = new Node(i);
            Node right = new Node(i + 10);
            n.left = left;
            n.right = right;
            n = left;
        }
        levelOrder(root);
    }

    static void levelOrder(Node root) {
        if (root == null) return;
        int h = height(root);
        for (int i = 0; i <= h; i++) {
            level(root, i);
        }
    }

    static void level(Node n, int l) {
        if (n == null) return;
        if (l == 0) System.out.print(n.data + " ");
        else {
            level(n.left, l - 1);
            level(n.right, l - 1);
        }
    }

    static void topView(Node root) {
        if (root == null) return;
        leftView(root);
        rightView(root.right);
    }

    static void leftView(Node root) {
        if (root == null) return;
        leftView(root.left);
        System.out.print(root.data + " ");
    }


    static void rightView(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        rightView(root.right);
    }

    static int height(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    static class Node {
        int data;
        Node left;
        Node right;
        Node(int i) {
            data = i;
        }
    }
}
