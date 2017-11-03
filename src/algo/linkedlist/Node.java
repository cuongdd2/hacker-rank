package algo.linkedlist;

class Node {
  int data;
  Node next;

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("" + data);
    Node n = this;
    while (n.next != null) {
      n = n.next;
      sb.append("->").append(n.data);
    }
    return sb.toString();
  }
}
