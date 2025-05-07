# LinkList Class

This Java code defines a `LinkList` class that implements a singly linked list data structure. It provides various operations for manipulating the linked list, including adding nodes, reversing the list, deleting nodes, checking for palindromes, detecting and breaking loops, and performing merge sort and a zig-zag pattern rearrangement.

## Class Structure

The `LinkList` class consists of:

-   **`Node` inner class:** Represents a node in the linked list. Each node contains an integer `data` and a reference to the `next` node.
-   **`length`:** An integer variable to keep track of the number of nodes in the list.
-   **`tail`:** A `Node` reference to the last node of the list.
-   **`head`:** A `Node` reference to the first node of the list.

## Methods

The `LinkList` class provides the following methods:

### `addatlast(int data)`

Adds a new node with the given `data` at the end of the linked list.

### `add_as_first(int data)`

Adds a new node with the given `data` at the beginning of the linked list.

### `reverse()`

Reverses the linked list in place.

### `delete_ith_node(int i)`

Deletes the node at the specified index `i` (1-based index).

### `get()`

Prints the data of all nodes in the linked list from head to tail.

### `check_palindrome()`

Checks if the linked list is a palindrome. It first finds the middle of the list, reverses the second half, and then compares the first half with the reversed second half.

### `checkloop(Node headoflinklist)`

Checks if the linked list contains a loop using the Floyd's cycle-finding algorithm (also known as the tortois and hare algorithm). It takes the head of a linked list as input and returns `true` if a loop is detected, `false` otherwise.

### `breakLoop(Node headoflinklist)`

Breaks a loop in the linked list if one exists. It uses the `checkloop` method to detect a loop and then finds the starting node of the loop to break the connection.

### `mergesort(Node headofLL)`

Sorts the linked list in ascending order using the merge sort algorithm. It takes the head of a linked list as input and returns the head of the sorted linked list.

### `zikzackpatern(Node LLhead)`

Rearranges the linked list nodes in a zig-zag pattern. It first finds the middle of the list, reverses the second half, and then interleaves the nodes from the first and second halves.

### `main(String[] args)`

The main method provides an example of how to use the `LinkList` class. It creates a linked list, adds some nodes, and then demonstrates the use of the `zikzackpatern` method.

## Usage

To use the `LinkList` class, you can create an instance of the class and then call its methods to perform operations on the linked list.

```java
LinkList myList = new LinkList();

// Add nodes to the list
myList.add_as_first(5);
myList.add_as_first(4);
myList.add_as_first(3);
myList.add_as_first(2);
myList.add_as_first(1);
myList.add_as_first(0);

// Print the list
myList.get(); // Output: 0 1 2 3 4 5

// Reverse the list
myList.reverse();
myList.get(); // Output: 5 4 3 2 1 0

// Delete a node
myList.delete_ith_node(3); // Delete the node at index 3 (data 3)
myList.get(); // Output: 5 4 2 1 0

// Check if the list is a palindrome
boolean isPalindrome = myList.check_palindrome();
System.out.println("Is palindrome: " + isPalindrome);

// Example of using mergesort (you would need to assign the result back to a variable)
// Node sortedHead = LinkList.mergesort(myList.head);

// Example of using zikzackpatern (operates directly on the list)
LinkList anotherList = new LinkList();
anotherList.addatlast(1);
anotherList.addatlast(2);
anotherList.addatlast(3);
anotherList.addatlast(4);
anotherList.addatlast(5);
LinkList.zikzackpatern(anotherList.head); // Output: 1 5 2 4 3
