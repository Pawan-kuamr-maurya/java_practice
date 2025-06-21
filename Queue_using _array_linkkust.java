import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class Queuedsa {

    static void interleav_queue(String s) {
        if (s.length() % 2 != 0) {
            return;
        }
        queueusingLinklist q = new queueusingLinklist();
        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }
        queueusingLinklist last = new queueusingLinklist();
        for (int i = 0; i < s.length() / 2; i++) {
            last.add(q.remove());
        }

        for (int i = 0; i < s.length() / 2; i++) {

            q.add(q.remove());
            q.add(last.remove());
        }

        for (int i = 0; i < s.length(); i++) {

            System.out.print((char) q.remove());
        }

    }

    static void firstnonrepeatingLetter(String s) {
        int arr[] = new int[26];
        queueusingLinklist q = new queueusingLinklist();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a']++;
            q.add(c);

            while (!q.isEmpty() && (arr[q.peek() - 'a'] > 1)) {
                q.remove();
            }

        }
        if (q.isEmpty()) {
            System.out.println("No non-repeating character");
        } else {
            System.out.println((char) q.peek());
        }
    }
    static void Queuereverse(Queue < Integer > q1) {
        Stack < Integer > st = new Stack < > ();
        while (!q1.isEmpty()) {
            st.push(q1.remove());
        }
        while (!st.isEmpty()) {
            q1.add(st.pop());
        }
        while (!q1.isEmpty()) {
            System.out.println(q1.remove());
        }
    }
    public static void main(String[] args) {

        Queue < Integer > q1 = new LinkedList < > ();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);

        Queuereverse(q1);

        // interleav_queue("abcdefghijkl");
        // firstnonrepeatingLetter("ppawan");
        //     queueUsingArray a =new queueUsingArray(5);
        //    a.add(1);

        //      a.add(2);
        //        a.add(3);
        //          a.add(4);
        //          a.add(5);
        //            a.add(6);
        //             System.out.println(a.remove());
        //           System.out.println(a.remove());
        //            a.add(7);
        //            a.add(8);

        //            System.out.println(a.remove());
        //             System.out.println(a.remove());
        //              System.out.println(a.remove());
        //               System.out.println(a.remove());
        //      System.out.println(a.remove());
        //               System.out.println(a.remove());


        //          queueusingLinklist q= new queueusingLinklist();
        //          q.add(2);
        //            q.add(3);
        //              q.add(4);
        //              System.out.println(q.remove());
        // System.out.println(q.remove());
        //              System.out.println(q.remove());
        //              System.out.println(q.remove());

    }
}

class queueusingLinklist {
    LinkedList < Integer > s;
    queueusingLinklist() {
        s = new LinkedList < > ();
    }

    void add(int num) {
        s.addLast(num);
    }
    int remove() {
        if (s.isEmpty()) {
            System.out.println("empty");
            return -1;
        }
        return s.removeFirst();
    }
    int length() {
        return s.size();
    }
    int peek() {
        return s.peek();
    }
    boolean isEmpty() {
        return s.isEmpty();
    }
}

class queueUsingArray {
    int arr[];
    int length;

    int front = -1;
    int rear = -1;
    public queueUsingArray(int n) {
        arr = new int[n];
        length = n;
    }
    boolean add(int num) {
        if (isFull()) {
            return false;
        }
        if (rear == -1 && front == -1) {
            rear = 0;
            front = 0;
        } else if (rear == length - 1 && front > 0) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = num;
        System.err.println("done " + arr[rear] + " " + rear);
        return true;
    }
    int remove() {
        if (isEmpty()) {
            return -1;
        }
        int result = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == length - 1) {
            front = 0;
        } else {
            front++;
        }
        return result;
    }

    boolean isEmpty() {
        if (rear == -1 || front == -1) {
            return true;
        } else {
            return false;
        }
    }
    boolean isFull() {
        if ((front == 0 && rear == length - 1) || rear + 1 == front) {
            return true;
        } else {
            return false;
        }
    }
    void print() {

        for (int idx = 0; idx < length; idx++) {

            System.out.println(arr[idx]);
        }

    }
    int peek() {
        if (isEmpty()) {
            return -1; // or throw an exception
        }
        return arr[front];
    }

}
