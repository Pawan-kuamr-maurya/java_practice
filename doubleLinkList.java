public class Doublelinklist {

  class Node {

    int data;
    Node next;
    Node prev;

    public Node() {
      next = null;
      prev = null;
    }
  }

  Node head = null, tail = null;
  int size = 0;

  public Doublelinklist() {
    this.head = null;
    this.tail = null;
  }

  public Doublelinklist(int data1) {
    Node firstnode = new Node();
    firstnode.data = data1;
    head = firstnode;
    tail = firstnode;
    firstnode.next = null;
    firstnode.prev = null;
    size++;
  }

  public void add_as_first(int data1) {
    Node node = new Node();
    node.data = data1;
    if (head == null && tail == null) {
      head = node;
      tail = node;
      node.next = null;
      node.prev = null;
      size++;
    } else {
      node.next = head;
      node.prev = null;
      head.prev = node;
      head = node;
      size++;
    }
  }

  public void get(boolean reverse) {
    Node tem;
    if (!reverse) {
      tem = head;
      while (tem != null) {
        System.out.println(tem.data);
        tem = tem.next;
      }
    } else {
      tem = tail;
      while (tem != null) {
        System.out.println(tem.data);
        tem = tem.prev;
      }
    }
  }

  public int remove(int position) {
    if (head == null || position < 0) {
      // List is empty or invalid position
      System.out.println("Invalid position or empty list");
      return -1;
    }
    if (position == 0) {
      Node toRemove = head;
      head = head.next;
      if (head != null) { //postion bhi  0 ho aur node me kais sare  element ho
        head.prev = null; // tab updated head  ka prevous set kiya ja sakta hai
      }
      System.out.println("Removed node with data: " + toRemove.data);
      return toRemove.data;
    }
    Node temp = head;
    // tab tak Traverse karn  hai jab tak usse ek piche na aa jaye
    for (int i = 0; i < position - 1; i++) {
      if (temp == null || temp.next == null) { // kaya pata posion khojate khojte  d LL hi khatm ho jaye DLL.length<postion
        System.out.println("Position out of bounds");
        return -1;
      }
      temp = temp.next;
    }

    Node nodeToRemove = temp.next; //kya pata vo revove karne wali position just last ke bad wali ho
    if (nodeToRemove == null) {
      System.out.println("Position out of bounds");
      return -1;
    }

    // Adjust the pointers to remove node
    temp.next = nodeToRemove.next;
    if (nodeToRemove.next != null) {
      nodeToRemove.next.prev = temp; //agar jisko delete karna hai uske aage bhi node ho ,uks prev me dataupdate kar do
    }

    System.out.println("Removed node with data: " + nodeToRemove.data);
    return nodeToRemove.data;
  }

  public static void main(String[] args) {
    Doublelinklist l = new Doublelinklist(0);
    l.add_as_first(1);
    l.add_as_first(2);
    l.add_as_first(3);
    l.add_as_first(4);
    l.add_as_first(5);
    l.add_as_first(6);
    l.remove(1);
    l.get(true);
  }
}
