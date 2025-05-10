import java.util.ArrayList;

public class Stack {

  static class Stack_ArrayList {

    ArrayList<Integer> data = new ArrayList<Integer>();
    int index = -1; // Array list jo hai vo zero base indexing ke sath  hai

    void push(int value) {
      data.add(value);
      index++;
    }

    int pop() {
      if (index == -1) {
        System.out.println("stack is empty");
        return -1;
      }
      index--;
      return data.get(index + 1);
    }

    int peek() {
      if (index == -1) {
        System.out.println("stack is empty");
        return -1;
      }
      return data.get(index);
    }
  }

  static class Stack_LinkList {

    class Node {

      int data;
      Node next;
    }

    Node head = null;

    void push(int data1) {
      Node newnode = new Node();
      if (head == null) {
        newnode.data = data1;
        newnode.next = null;
        head = newnode;
        return;
      }
      newnode.data = data1;
      newnode.next = head;
      head = newnode;
      return;
    }

    int pop() {
      if(head==null){  System.out.println("stack is empty"); return -1;}
      int data = head.data;
      head = head.next;
      return data;
    }

    int peek() {
       if(head==null){  System.out.println("stack is empty"); return -1;}
      return head.data;
    }
  }

  public static void main(String[] args) {
    Stack_LinkList s = new Stack_LinkList();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.println(s.peek());
    s.pop();
    System.out.println(s.peek());
  }
}
