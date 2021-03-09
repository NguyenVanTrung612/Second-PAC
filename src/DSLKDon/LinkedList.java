package DSLKDon;

public class LinkedList {
  public int size;
  public Node head;
  public Node tail;

  public LinkedList() {
    this.size = 0;
    this.head = null;
    this.tail = null;
  }

  public int size() {
    return this.size;
  }

  public Node search(int studentId) {
    Node currentNode = this.head;
    while (currentNode != null) {
      if (currentNode.hasStudent(studentId)) {
        return currentNode;
      }
      currentNode = currentNode.next;
    }
    return null;
  }

  public void insecrtAt(Node node, int position) {
    if (position < 1 || this.size == 0) {
      node.next = this.head;
      this.head = node;
      if (this.tail == null) {
        this.tail = node;
      }
      this.size++;
      return;
    }

    // THEM THONG TIN O PHIA SAU //
    if (position >= this.size) {
      if (this.tail != null) {
        this.tail.next = node;
      }
      this.tail = node;
      if (this.head == null) {
        this.head = node;
      }
      this.size++;
      return;
    }
    Node preNode = null;
    Node currentNode = this.head;
    int counter = 0;
    while (counter < position) {
      counter++;
      preNode = currentNode;
      currentNode = currentNode.next;
    }
    node.next = currentNode;
    preNode.next = node;
    this.size++;
  }

  public void printList() {
    System.out.println("printList");
    // THEM THONG TIN PHIA DAU //
    // System.out.println("\n----------------------------");
    // System.out.println("\nsize = " + this.size);
    Node currentNode = this.head;
    while (currentNode != null) {
      currentNode.printData();
      currentNode = currentNode.next;
    }
  }
}
