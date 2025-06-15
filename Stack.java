import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
  static class Stack_ArrayList {
    ArrayList < Integer > data = new ArrayList < Integer > ();
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
      if (head == null) {
        return -1;
      }
      int data = head.data;
      head = head.next;
      return data;
    }
    int peek() {
      return head.data;
    }
    boolean isempty() {
      return head == null;
    }
    void place_Atbottem(int da) {

      if (this.isempty()) {

        this.push(da);
        return;
      } else {
        int datta = this.pop();
        this.place_Atbottem(da);
        this.push(datta);
      }

    }

  }

  static String reverse_string(String args) {
    Stack < Character > c = new Stack < > ();
    for (int i = 0; i < args.length(); i++) {
      c.push(args.charAt(i));
    }
    StringBuilder s = new StringBuilder();
    while (!c.isEmpty()) {
      s.append(c.pop());
    }
    return s.toString();
  }

  static void reverse_string_with_noextraspace(Stack < Character > s) {
    if (s.isEmpty()) {
      return;
    }

    char tem = s.pop();
    reverse_string_with_noextraspace(s);
    stack_place_at_bottom(s, tem);
  }

  static void stack_place_at_bottom(Stack < Character > s, char item) {
    if (s.isEmpty()) {
      s.push(item);
      return;
    }
    char current = s.pop();
    stack_place_at_bottom(s, item);
    s.push(current);

    return;
  }

  static int[] stock_span_problem(int a[]) {
    int[] tem = new int[a.length];
    tem[0] = 1;
    Stack < Integer > s = new Stack < > ();
    s.push(0);

    for (int i = 1; i < a.length; i++) {
      // Pop while the current element is greater than or equal to the element at top of stack
      while (!s.isEmpty() && a[s.peek()] <= a[i]) {
        s.pop();
      }
      // If stack is empty, span is i+1
      if (s.isEmpty()) {
        tem[i] = i + 1;
      } else {
        // Else span is difference between current index and top of stack
        tem[i] = i - s.peek();
      }
      s.push(i);
    }

    return tem;
  }

  public static void next_graeatrer_element(int arr[]) {
    Stack < Integer > st = new Stack < > ();
    int next_greater[] = new int[arr.length];
    next_greater[arr.length - 1] = -1;
    st.push(arr[arr.length - 1]);
    for (int i = arr.length - 2; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() <= arr[i]) {
        st.pop();
      }
      if (!st.isEmpty()) {
        next_greater[i] = st.peek();
      } else {
        next_greater[i] = -1;
      }
      st.push(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(next_greater[i]);
    }
  }

  public static boolean pawanduplicateParentheses(String args) {
    Stack < Character > st = new Stack < > ();

    for (int i = 0; i < args.length(); i++) {
      char ch = args.charAt(i);
      if (ch == ')') {
        if (st.isEmpty()) {
          System.out.println("*");
          return true;
        }
        if (st.peek() == '(') {
          System.out.println("#");
          return true;
        }

        while (!st.isEmpty() && st.peek() != '(') {
          st.pop();
          System.out.println("_-");
        }
        if (st.isEmpty()) {
          return true;
        }
        if (st.peek() == '(') {
          st.pop();
        }

      } else {
        st.push(ch);

      }

    }
    return false;
  }

  //best alogrith to understand find next smallsest or next bigger elemet in the given array for each elememt 

  public static void maxareahistogram(int arr[]) {
    int ls[] = new int[arr.length];
    int rs[] = new int[arr.length];
    Stack < Integer > s = new Stack < > ();
    for (int i = 0; i < arr.length; i++) {
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        ls[i] = -1;
      } else {
        ls[i] = s.peek();
      }
      s.push(i);
    }
    s.clear();
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        rs[i] = arr.length; // we not put -1 becouse its create problem when all wlemrt are equal  and we get -1 for both aray
      } else {
        rs[i] = s.peek();
      }
      s.push(i);
    }

    //    for (int idx = 0; idx < ls.length; idx++) {
    //       System.out.print(" " +ls[idx]);

    //    }
    //    System.out.println("");
    //    for (int idx = 0; idx < rs.length; idx++) {
    //       System.out.print(" " +rs[idx]);

    //    }
    int biggest = 0,
      var;
    for (int idx = 0; idx < arr.length; idx++) {
      var = (rs[idx] - ls[idx] - 1) * arr[idx];
      if (biggest <
        var) {
        biggest =
          var;
      }
    }
    System.out.println(biggest);
  }
  public static void main(String[] args) {
   Stack_LinkList stackLL = new Stack_LinkList();
stackLL.push(1);
stackLL.push(2);
stackLL.push(3);
System.out.println("Peek: " + stackLL.peek()); // Output: 3
System.out.println("Pop: " + stackLL.pop());   // Output: 3
stackLL.place_Atbottem(0);
while (!stackLL.isempty()) {
    System.out.println("Pop from bottom: " + stackLL.pop()); // Outputs 0, 2, 1
}

    String original = "hello";
String reversed = reverse_string(original);
System.out.println("Reversed String: " + reversed); // Output: "olleh"


    Stack<Character> s = new Stack<>();
String str = "world";
for (char ch : str.toCharArray()) {
    s.push(ch);
}
reverse_string_with_noextraspace(s);
StringBuilder sb = new StringBuilder();
while (!s.isEmpty()) {
    sb.append(s.pop());
}
System.out.println("Reversed without extra space: " + sb.toString()); // "dlrow"


int[] prices = {100, 80, 60, 70, 60, 75, 85};
int[] span = stock_span_problem(prices);
for (int s : span) {
    System.out.print(s + " "); // Output: 1 1 1 2 1 4 6
}

    int[] arr = {4, 5, 2, 25};
next_graeatrer_element(arr);
// Output:
// 5
// 25
// 25
// -1


System.out.println(pawanduplicateParentheses("((a+b))")); // Output: true (duplicate parentheses)
System.out.println(pawanduplicateParentheses("(a+b)"));   // Output: false
    
    int[] histogram = {2, 1, 5, 6, 2, 3};
maxareahistogram(histogram); // Output: 10
    
  }

}
