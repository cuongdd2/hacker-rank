package algo.linkedlist;

public class LinkedList {

  public static void main(String[] args) {
    LinkedList me = new LinkedList();
    Node head = null;
    head = me.insert(head, 1, 0);
    head = me.insert(head, 2, 1);
    head = me.insert(head, 3, 2);
    head = me.insert(head, 4, 3);
    System.out.println(head);
    Node rv = me.reverse(head);
    System.out.println(rv);
  }

  Node insert(Node head, int data, int position) {
    Node nn = new Node();
    nn.data = data;
    if (head == null) return nn;
    Node cur = head;
    int i = 1;
    while (i++ < position) {
      cur = cur.next;
    }
    Node next = cur.next;
    cur.next = nn;
    nn.next = next;
    return head;
  }

  private Node newHead;
  Node reverse(Node head) {
    if (head == null) return null;
    Node n = reverse(head.next);
    if (n != null) {
      head.next = null;
      n.next = head;
      return head;
    } else newHead = head;
    return newHead;
  }
}

