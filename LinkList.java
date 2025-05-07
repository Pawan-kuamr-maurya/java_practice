public class LinkList {

  static class Node {

    int data;
    Node next;

    Node() {
      this.next = null;
    }

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  int length = 0;
  Node tail = null;
  Node head = null;

  void addatlast(int data) {
    length++;
    Node creatednode = new Node(data);
    if (head == null && tail == null) {
      head = tail = creatednode;
      return;
    }
    tail.next = creatednode;
    tail = creatednode;
  }

  void add_as_first(int data) {
    length++;
    Node creatednode = new Node(data);
    if (head == null && tail == null) {
      head = tail = creatednode;
      return;
    }
    creatednode.next = head;
    head = creatednode;
  }

  void reverse() {
    Node curent = head, next = head.next, prev = null;

    while (curent != null) {
      next = curent.next;
      curent.next = prev;
      prev = curent;

      curent = next;
    }
    tail = head; // Original head becomes the tail
    head = prev; // Update head to the new head
  }

  void delete_ith_node(int i) {
    Node tem = head.next, addrs = head;
    if (i == 1) {
      head = head.next;
      return;
    }
    if (i == 2) {
      addrs.next = tem.next;
      return;
    }
    for (int j = 1; j < i - 1; j++) {
      tem = (tem.next);
      addrs = addrs.next;
    }

    addrs.next = tem.next;

    if (i == this.length) {
      tail = tem;
    }
    return;
  }

  void get() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  boolean check_palindrome() {
    if (head == null) {
      return true; // Handle empty list case
    }

    Node ptrslow = head;
    Node ptrfast = head;

    while (ptrfast.next != null && ptrfast.next.next != null) {
      ptrslow = ptrslow.next; // Move slow by one
      ptrfast = ptrfast.next.next; // Move fast by two
    }

    // This will be the middle node
    Node prev = null, current = ptrslow, ctrnext = null;
    while (current != null) {
      ctrnext = current.next;
      current.next = prev;
      prev = current;
      current = ctrnext;
    }

    prev = head;
    ctrnext = tail;
    while (ctrnext.next != null) {
      if (ctrnext.data != prev.data) {
        return false;
      }
      ctrnext = ctrnext.next;
      prev = prev.next;
    }

    return true;
  }

  static Node prevfast = null;

  public static boolean checkloop(Node headoflinklist) {
    Node slow = headoflinklist;
    Node fst = headoflinklist;
    while (fst != null && fst.next != null) {
      slow = slow.next;
      fst = fst.next.next;
      // System.out.println(prevfast.data+   "   ganne ka juse" +fst.data);
      prevfast = fst;
      if (fst == slow) {
        return true;
      }
    }
    return false;
  }

  public static void breakLoop(Node headoflinklist) {
    if (checkloop(headoflinklist)) {
      Node beg = headoflinklist, fast = prevfast, update = null;
      while (beg != fast) {
        update = fast;
        beg = beg.next;
        fast = fast.next;
      }

      update.next = null;
      // System.out.println(prevfast.data);
    }
  }

  public static Node mergesort(Node headofLL) {
    //find mid
    if (headofLL == null || headofLL.next == null) {
      return headofLL;
    }
    Node slow = headofLL, fast = headofLL.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // call again mergesort
    Node agla = slow.next;
    slow.next = null;
    Node left = mergesort(headofLL);
    Node right = mergesort(agla);
    Node ret = new Node();
    Node str = ret;
    while (left != null && right != null) {
      if (left.data < right.data) {
        ret.next = left;
        left = left.next;
      } else {
        ret.next = right;
        right = right.next;
      }
      ret = ret.next;
    }
    if (left != null) {
      ret.next = left;
    } else {
      ret.next = right;
    }
    // then merge and return start pointer

    return str.next;
    //  LinkList l1= new LinkList();
    // Node l3= mergesort(l1.head);
  }

  static void zikzackpatern(Node LLhead) {
    Node slow = LLhead, fast = LLhead.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = (fast.next).next;
    }
    Node first = LLhead;
    Node second = slow.next;
    slow.next = null;
    Node curent = second, next = second.next, prev = null;

    while (curent != null) {
      next = curent.next;
      curent.next = prev;
      prev = curent;
      curent = next;
    }
    second = prev; // Update head to the new head
    Node tem, tem2;
    while (first != null && second != null) {
      tem = first.next;
      first.next = second;
      tem2 = second.next;
      second.next = tem;
      first = tem;
      second = tem2;
    }
    Node current = LLhead;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkList l = new LinkList();
    l.add_as_first(5);
    l.add_as_first(4);
    l.add_as_first(3);
    l.add_as_first(2);
    l.add_as_first(1);
    l.add_as_first(0);
    // l.get();
    zikzackpatern(l.head);
  }
}
