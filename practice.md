# pk Class - A Collection of Java Practice Programs

This Java class `pk` contains a variety of static methods designed for practicing fundamental programming concepts and algorithms. It includes implementations for array manipulation, pattern printing, string operations, bit manipulation, recursion, sorting, backtracking, and more.

This code is primarily intended for learning and experimentation. It's a collection of individual functions that demonstrate different programming techniques.

## Structure

The `pk` class is a simple public class containing only static methods. It does not have any instance variables or constructors for object creation. All operations are performed directly through the static methods.

## Methods

The `pk` class provides the following methods:

### Pattern Printing

-   **`printbutterfly()`:** Prints a butterfly pattern of asterisks based on user input for dimensions.
-   **`dimond()`:** Prints a diamond pattern of asterisks based on user input for the number of rows.

### Array Operations

-   **`subarray()`:** Calculates and prints the sum of all possible subarrays of a user-provided array. It also prints the cumulative sum array.
-   **`trapingwater()`:** Calculates the amount of rainwater trapped between building bars represented by an array of heights.
-   **`stocks()`:** (Bad implementation - use `newatock` instead) Attempts to find the maximum profit that can be obtained by buying and selling a stock, given an array of stock prices.
-   **`newatock()`:** Calculates the maximum profit that can be obtained by buying and selling a stock using a more efficient approach.
-   **`mergesort(int a[], int f, int l)`:** Implements the merge sort algorithm to sort an integer array. It's a recursive method that divides the array, sorts the sub-arrays, and then merges them.
-   **`merge(int f[], int fb, int fl, int l[], int lf, int ll)`:** A helper method for `mergesort` that merges two sorted sub-arrays into a single sorted array.

### Matrix Operations

-   **`spiralprint()`:** Prints the elements of a hardcoded 2D matrix in a spiral order.
-   **`dignolssum()`:** Calculates the sum of the elements on the main and anti-diagonals of a user-provided square matrix.
-   **`serchinsorted()`:** Searches for a specific key in a user-provided sorted 2D matrix.

### String Operations

-   **`sortestdistance(String str)`:** Calculates the shortest distance from the origin (0,0) after following a series of movements represented by a string (e.g., "nenessw").
-   **`firstlettercaptal(String intro)`:** Capitalizes the first letter of each word in a given string.
-   **`stringcompression(String args)`:** Compresses a string by replacing consecutive repeating characters with the character followed by the count (e.g., "aaabbc" becomes "a3b2c").
-   **`remove_dublicate(String original, StringBuilder args, int index, boolean map[])`:** Recursively removes duplicate characters from a string.
-   **`print_all_subset_using_recursion(String args, int index, String current)`:** Recursively prints all possible subsets (subsequences) of a given string.
-   **`string_char_permutation(StringBuilder args, String select)`:** Recursively generates and prints all permutations of the characters in a given string.

### Bit Manipulation

-   **`checkingnumbver_is_odd_or_even()`:** Checks if a user-provided integer is odd or even using bitwise operations.
-   **`get_i_th_bit_in_number(int num, int i)`:** Gets the value (0 or 1) of the i-th bit of a given integer.
-   **`set_ith_postion(int num, int i)`:** Sets the i-th bit of a given integer to 1.
-   **`clear_ith_postion(int num, int i)`:** Clears (sets to 0) the i-th bit of a given integer.
-   **`clear_ibit_from_last(int num, int i)`:** Clears the last `i` bits of a given integer.
-   **`clear_bit_in_rangei_to_n_with_one_indexing(int num, int i, int j)`:** Clears the bits in a given range (from index `i` to `j`, 1-based indexing) of an integer.
-   **`checkwether2spowerornot(int num)`:** Checks if a given integer is a power of 2 using bitwise operations.
-   **`count_set_bit(int num)`:** Counts the number of set bits (bits with value 1) in a given integer.
-   **`calculate_power_in_binary(int a, int b)`:** Calculates `a` raised to the power of `b` using binary exponentiation (efficient for large powers).

### Recursion

-   **`factorial(int n)`:** Calculates the factorial of a non-negative integer recursively.
-   **`sum_of_n_natural_num(int n)`:** Calculates the sum of the first `n` natural numbers recursively.
-   **`febonic_num_base_zero(int n)`:** Calculates the n-th Fibonacci number (0-based index) recursively.
-   **`check_shorted_array(int a[], int j)`:** Recursively checks if an array is sorted in ascending order.
-   **`first_occurence(int a[], int num, int pos)`:** Recursively finds the index of the first occurrence of a given number in an array.
-   **`last_occurence(int a[], int num, int pos)`:** Recursively finds the index of the last occurrence of a given number in an array.
-   **`calculate_power(int num, int pow)`:** Calculates `num` raised to the power of `pow` recursively (basic implementation).
-   **`optimize_calculation(int num, int pow)`:** Calculates `num` raised to the power of `pow` recursively using an optimized approach (binary exponentiation).
-   **`tile_Question(int n)`:** Solves a tiling problem recursively (number of ways to tile a 2xn board with 2x1 tiles).
-   **`friend_pairing(int num)`:** Solves a friend pairing problem recursively (number of ways to pair up `num` friends, where friends can be in pairs or remain single).
-   **`print_String_nin_non_11(int num, int prevDigit, String currentString)`:** Recursively prints all binary strings of length `num` that do not contain consecutive '1's.

### Backtracking

-   **`NQueen_by_backdracking(char c[][], int row)`:** Solves the N-Queens problem using backtracking and prints all possible solutions.
-   **`grid_move_down_right(char mat[][], int i, int j)`:** Recursively calculates the number of possible paths from the top-left to the bottom-right of a grid, only allowing moves down or right.
-   **`grid_move_down_right_optimize()`:** Calculates the number of possible paths in a grid using a mathematical formula (combinatorics) for optimization.
-   **`sudokosolver(int sudoko[][], int i, int j)`:** Solves a given Sudoku puzzle using backtracking.
-   **`issafe(int sudoko[][], int i, int j, int k)`:** A helper method for `sudokosolver` that checks if placing a number `k` at a specific cell `(i, j)` in the Sudoku grid is valid according to Sudoku rules.

### Other

-   **`fact(int n)`:** Prints the binary representation of a number and the sum of the powers of 2 corresponding to the set bits.
-   **`bintoint(int n)`:** Converts a binary number (represented as an integer) to its decimal equivalent.
-   **`dict_short(int a[], int n)`:** Sorts an array of integers as if they were strings (lexicographical order).
-   **`print2Darray(int[][] grid)`:** A utility method to print a 2D integer array.

## How to Use

This class is designed for direct method calls. You can call any of the static methods from your `main` method or another class to execute the desired functionality. Many methods require user input using the `Scanner` class.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Example usage:
        pk.checkingnumbver_is_odd_or_even(); // Prompts for input and checks odd/even
        pk.factorial(5); // Calculates and returns factorial (you'd need to print the return value)
        pk.printbutterfly(); // Prompts for input and prints the butterfly pattern
        // ... call other methods as needed
    }
}
