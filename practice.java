import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pk {

  public static void fact(int n) {
    int bin = 1, num = 0;
    while (n > 0) {
      if (n % 2 != 0) {
        num = bin + num;
        System.err.println("*" + bin);
      }
      bin = bin * 10;
      n = n / 2;
    }
    System.err.println(num);
  }

  public static int bintoint(int n) {
    int dec = 0;
    int tem, i = 0;
    while (n > 0) {
      tem = n % 10;
      if (tem == 1) {
        dec = dec + (int) Math.pow(2, i);
      }
      i++;
      n = n / 10;
    }
    return dec;
  }

  public static void printbutterfly() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int col = sc.nextInt();
    int n = 1, count = 1;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < 2 * (num - i); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
    for (int i = num; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < 2 * (num - i); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }

  public static void dimond() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (j < num - i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.err.println("");
    }
    for (int i = num; i > 0; i--) {
      for (int j = 0; j < num; j++) {
        if (j < num - i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.err.println("");
    }
  }

  public static void subarray() {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, tem = 0;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int array[] = new int[num];
    int copy[] = new int[num];
    for (int i = 0; i < num; i++) {
      array[i] = sc.nextInt();
    }
    for (int i = 0; i < num; i++) {
      if (i == 0) {
        copy[i] = array[i];
      } else {
        copy[i] = copy[i - 1] + array[i];
      }
    }
    for (int i = 0; i < num; i++) {
      System.out.print(" " + copy[i]);
    }
    for (int i = 0; i < num; i++) {
      for (int j = i + 1; j < num; j++) {
        System.out.print("(");
        System.out.print(array[i] + "," + array[j]);
        if (i == 0) {
          tem = copy[j];
        } else {
          tem = copy[j] - copy[i - 1];
        }

        System.out.print(")=" + tem + " ");
      }
      System.out.println("");
    }
  }

  public static void trapingwater() {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the length of array");
    int num = sc.nextInt();
    int array[] = new int[num];
    int rightmax[] = new int[num];
    int leftmax[] = new int[num];
    for (int i = 0; i < num; i++) {
      array[i] = sc.nextInt();
    }
    int rightmaxval = Integer.MIN_VALUE, leftmaxval = Integer.MIN_VALUE;
    for (int i = 1; i < num - 1; i++) {
      if (array[num - i] > rightmaxval) {
        rightmaxval = array[num - i];
      }
      rightmax[num - i - 1] = rightmaxval;
      if (array[i - 1] > leftmaxval) {
        leftmaxval = array[i - 1];
      }
      leftmax[i] = leftmaxval;
    }

    int water = 0, tem = 0;
    for (int i = 0; i < num; i++) {
      if (i == 0 || i == num - 1) {
        continue;
      }
      tem = Math.min(rightmax[i], leftmax[i]);
      if (tem > array[i]) {
        tem = tem - array[i];
      } else {
        tem = 0;
      }

      water = tem + water;
      tem = 0;
    }
    System.err.println(water);
  }

  public static void stocks() { // bad way to do it dont use it
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the length of array");
    int num = sc.nextInt();
    int array[] = new int[num];
    for (int i = 0; i < num; i++) {
      array[i] = sc.nextInt();
    }
    int leftbiggest[] = new int[num], leftbiggestday[] = new int[num], day =
      -1, tem = Integer.MIN_VALUE;
    for (int i = num - 1; i >= 0; i--) {
      if (array[i] > tem) {
        tem = array[i];
        day = i;
      }
      leftbiggest[i] = tem;
      leftbiggestday[i] = day;
    }
    day = -1;
    tem = -1;
    int profit = Integer.MIN_VALUE;
    for (int i = 0; i < num; i++) {
      if (leftbiggest[i] - array[i] > profit) {
        profit = leftbiggest[i] - array[i];
        day = i;
        tem = leftbiggestday[i];
      }
    }
    System.out.println(
      "start: " + day + "\n" + "end: " + tem + "\n profit: " + profit
    );
  }

  public static void newatock() {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the length of array");
    int num = sc.nextInt();
    int array[] = new int[num];
    for (int i = 0; i < num; i++) {
      array[i] = sc.nextInt();
    }
    int profit = Integer.MIN_VALUE, min = array[0];
    for (int i = 1; i < num; i++) {
      if (array[i] > min) {
        if ((array[i] - min) > profit) {
          profit = array[i] - min;
        }
      } else {
        min = array[i];
      }
    }
    System.err.println(profit);
  }

  public static void spiralprint() {
    int matri[][] = {
      { 1, 2, 3, 4, 5 },
      { 6, 7, 8, 9, 10 },
      { 11, 12, 13, 14, 15 },
      { 16, 17, 18, 19, 20 },
      { 21, 22, 23, 24, 25 },
    };

    int sratrow = 0, startcoloumn = 0, end_row = matri.length - 1, end_col =
      matri[0].length - 1;

    while (sratrow <= end_row && startcoloumn <= end_col) {
      for (int i = startcoloumn; i <= end_col; i++) {
        System.err.println(matri[sratrow][i]);
      }

      for (int i = sratrow + 1; i <= end_row; i++) {
        System.err.println(matri[i][end_col]);
      }
      for (int i = end_col - 1; i >= startcoloumn; i--) {
        System.err.println(matri[end_row][i]);
      }
      for (int i = end_row - 1; i > sratrow; i--) {
        System.err.println(matri[i][startcoloumn]);
      }
      sratrow = sratrow + 1;
      end_row = end_row - 1;
      startcoloumn = startcoloumn + 1;
      end_col = end_col - 1;
    }
  }

  public static void dignolssum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("inter the one dimension of  the squre matrix");
    int dimension = sc.nextInt();
    int matrix[][] = new int[dimension][dimension];
    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    int sum = 0;
    for (int j = 0; j < dimension; j++) {
      if (j == (dimension - j - 1)) {
        sum = matrix[j][j] + sum;
        continue;
      }
      sum = matrix[j][j] + matrix[j][dimension - j - 1] + sum;
    }
    System.out.println(sum);
  }

  public static void serchinsorted() {
    Scanner sc = new Scanner(System.in);
    System.out.println("inter the one dimension of  the squre matrix");
    int dimension = sc.nextInt();
    int matrix[][] = new int[dimension][dimension];
    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("enter the element to be serch");
    int key = sc.nextInt();
    for (int i = 0; i < dimension; i++) {
      if (matrix[0][i] == key) {
        System.out.println("found elemet  at:" + 0 + " " + i);
      }
      if (
        (matrix[0][i] < key && i != dimension - 1 && matrix[0][i + 1] > key) ||
        i == dimension - 1
      ) {
        for (int j = 0; j < dimension; j++) {
          if (matrix[j][i] == key) {
            System.out.println("found elemet  at:" + j + " " + i);
            return;
          }
        }
        System.out.println("found not elemet ");
        return;
      }
    }
  }

  public static void sortestdistance(String str) {
    int x = 0, y = 0;
    double length = 0;
    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)) {
        case 'e':
          y++;
          break;
        case 'w':
          y--;
          break;
        case 'n':
          x++;
          break;
        case 's':
          x--;
          break;
      }
    }
    length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println(length);
  }

  public static void firstlettercaptal(String intro) {
    StringBuilder newstr = new StringBuilder("");

    for (int i = 0; i < intro.length(); i++) {
      if (i == 0 || intro.charAt(i - 1) == ' ') {
        newstr.append(Character.toUpperCase(intro.charAt(i)));
      } else {
        newstr.append(intro.charAt(i));
      }
    }
    System.out.println(newstr);
  }

  public static void stringcompression(String args) {
    StringBuffer newstr = new StringBuffer("");
    int count = 1;

    for (int i = 0; i < args.length(); i++) {
      if (i < args.length() - 1 && args.charAt(i) == args.charAt(i + 1)) {
        count++;
        continue;
      }
      newstr.append(args.charAt(i));
      if (count > 1) {
        newstr.append(count);
        count = 1;
      }
      // if(i==args.length()-1&&args.charAt(i)==args.charAt(i-1)){ count++; newstr.append(count); break;}
      // if (args.charAt(i)==args.charAt(i-1)) {
      //     count++;

      // }else{
      //     newstr.append(count);
      //  newstr.append(args.charAt(i));
      //   count=1;
      // }

    }
    System.out.println(newstr);
  }

  public static void checkingnumbver_is_odd_or_even() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(), bit = 1;
    //    num & 1
    if ((num & bit) == 0) {
      System.out.println("the given number is even ");
    } else {
      System.out.println("the given number is odd ");
    }
  }

  public static void get_i_th_bit_in_number(int num, int i) {
    int ibit = 1;
    int bit = ibit << i;
    if ((bit & num) == 0) {
      System.out.println("the given numbers ith bit is zero");
    } else {
      System.out.println("the given numbers ith bit is one");
    }
  }

  public static void set_ith_postion(int num, int i) {
    int iset = 1 << i;
    int newnum = num | iset;
    System.out.println(newnum);
  }

  public static void clear_ith_postion(int num, int i) {
    int iset = ~(1 << i);
    int newnum = num & iset;
    System.out.println(newnum);
  }

  public static void clear_ibit_from_last(int num, int i) {
    int sift = 1;
    for (int j = 0; i > j; j++) {
      sift = (sift << 1) + 1;
    }
    sift = ~(sift);
    num = sift & num;
    System.out.println(num);
  }

  public static void clear_bit_in_rangei_to_n_with_one_indexing(
    int num,
    int i,
    int j
  ) {
    if (i < j || j == 0) {
      return;
    }
    int andbit = (~0) << i;
    int val = (int) (Math.pow(2, j - 1) - 1);
    andbit = andbit | (val);
    System.out.println(num & (andbit));
    System.out.println(andbit);
    //int a =((~0)<<j+1);
    //int b=(1<<i)-1;
    // int bitmask=a|b;
    // int result bitmask&num;
  }

  public static void checkwether2spowerornot(int num) {
    int prev = num - 1;
    if ((num & prev) == 0) {
      System.out.println("power of 2");
    } else {
      System.out.println("not power of 2");
    }
  }

  public static void count_set_bit(int num) {
    int count = 0;
    while (num != 0) {
      if ((num & 1) == 1) {
        count++;
      }
      num = num >> 1;
      // System.out.println(num);
    }
    System.out.println(count);
  }

  public static void calculate_power_in_binary(int a, int b) {
    int result = 1;
    while (b != 0) {
      if ((b & 1) == 0) {
        result = result * 1;
      } else {
        result = result * a;
      }
      a = a * a;

      b = b >> 1;
    }
    System.out.println(result);
  }

  //recursion
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static int sum_of_n_natural_num(int n) {
    if (n == 1) {
      return 1;
    }
    int nextsum = sum_of_n_natural_num(n - 1);
    int current_sum = nextsum + n;
    return current_sum;
  }

  public static int febonic_num_base_zero(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int num = febonic_num_base_zero(n - 1) + febonic_num_base_zero(n - 2);

    return num;
  }

  public static boolean check_shorted_array(int a[], int j) {
    if (a[j] <= a[j + 1]) {
      if ((j + 2) == a.length) {
        System.out.println("done");
        return true;
      }
      System.out.println(a.length + "  " + (j + 1));
      return true & check_shorted_array(a, j + 1);
    } else {
      // System.out.println(a[j]+" " +a[j+1]);
      return false;
    }
  }

  public static int first_occurence(int a[], int num, int pos) {
    if (pos == (a.length - 1)) {
      return -1;
    }
    if (a[pos] == num) {
      return pos;
    } else {
      return first_occurence(a, num, pos + 1);
    }
  }

  public static int last_occurence(int a[], int num, int pos) {
    int findindex = -1;
    if (a[pos] == num) {
      findindex = pos;
      if (pos == (a.length - 1)) {
        return findindex;
      }
    }
    if (pos == (a.length - 1)) {
      return -1;
    }

    int further = last_occurence(a, num, pos + 1);
    if (further != -1) {
      return further;
    } else {
      return findindex;
    }
  }

  public static int calculate_power(int num, int pow) {
    if (pow == 1) {
      return num;
    } else {
      return num * calculate_power(num, pow - 1);
    }
  }

  public static int optimize_calculation(int num, int pow) {
    if (pow == 1) {
      return num;
    }
    if (pow % 2 == 0) {
      int k = optimize_calculation(num, pow / 2);
      return k * k;
    } else {
      int k = optimize_calculation(num, pow / 2);
      return num * k * k;
    }
  }

  public static int tile_Question(int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return 1;
    }
    // if(n==2){return 1;}
    int total = tile_Question(n - 1) + tile_Question(n - 2); //multiply bu 2 in n-2 way
    return total;
  }

  public static int friend_pairing(int num) {
    if (num == 1 || num == 2) {
      return num;
    }
    int alone = friend_pairing(num - 1);
    int friendpair = friend_pairing(num - 2);
    return alone + (num - 1) * friendpair;
  }

  public static void print_String_nin_non_11(
    int num,
    int prevDigit,
    String currentString
  ) {
    if (num == 0) {
      System.out.println(currentString); // Print the valid binary string
      return;
    }

    // If the previous digit was 0, we can append either 0 or 1
    if (prevDigit == 0) {
      print_String_nin_non_11(num - 1, 0, currentString + "0"); // Append 0
      print_String_nin_non_11(num - 1, 1, currentString + "1"); // Append 1
    }
    // If the previous digit was 1, we can only append 0
    else {
      print_String_nin_non_11(num - 1, 0, currentString + "0"); // Append 0
    }
    // print_String_nin_non_11(6, -1," ");
  }

  public static void dict_short(int a[], int n) {
    String s[] = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = String.valueOf(a[i]);
    }
    Arrays.sort(s);
    for (int i = 0; i < n; i++) {
      System.out.print(s[i]);
    }
  }

  public static int[] mergesort(int a[], int f, int l) {
    System.out.println();
    if (f < l) {
      int mid = (f + l) / 2;
      int[] left = mergesort(a, f, mid);
      int[] right = mergesort(a, mid + 1, l);

      return merge(left, 0, left.length - 1, right, 0, right.length - 1);
    } else {
      return new int[] { a[f] };
    }
  }

  public static int[] merge(int f[], int fb, int fl, int l[], int lf, int ll) {
    int arr[] = new int[(fl - fb + 1) + (ll - lf + 1)];
    int b = 0, e = 0, c = 0;
    while (b <= fl && e <= ll) {
      if (f[b] <= l[e]) {
        arr[c] = f[b];
        b++;
      } else {
        arr[c] = l[e];
        e++;
      }
      c++;
    }
    while (e <= ll) {
      arr[c] = l[e];
      e++;
      c++;
    }
    while (b <= fl) {
      arr[c] = f[b];
      b++;
      c++;
    }

    return arr;
    //   int a[]={9,8,7,6,5,4,3,2,1};
    //   int res[]=mergesort(a, 0, a.length-1);
  }

  public static void remove_dublicate(
    String original,
    StringBuilder args,
    int index,
    boolean map[]
  ) {
    if (original.length() == index) {
      System.out.println(args);
      return;
    }
    System.out.println(index + "  " + original.length());
    if (map[original.charAt(index) - 'a'] == true) {
      remove_dublicate(original, args, index + 1, map);
    } else {
      map[original.charAt(index) - 'a'] = true;
      remove_dublicate(
        original,
        args.append(original.charAt(index)),
        index + 1,
        map
      );
    }
    //boolean[] map = new boolean[26];
    //   StringBuilder str =new StringBuilder();
    // remove_dublicate("oraiaaginal",str, 0, map);
  }

  public static void print_all_subset_using_recursion(
    String args,
    int index,
    String current
  ) {
    // Base case: if we've processed all characters
    if (index == args.length()) {
      System.out.print(current + "\n"); // Print the currently built subset
      return;
    }

    // Exclude the current character and move to the next
    print_all_subset_using_recursion(args, index + 1, current);

    // Include the current character and move to the next
    print_all_subset_using_recursion(
      args,
      index + 1,
      current + args.charAt(index)
    );
  }

  public static void string_char_permutation(
    StringBuilder args,
    String select
  ) {
    if (0 == args.length()) {
      System.out.println(select);
      return;
    }

    for (int i = 0; i < args.length(); i++) {
      StringBuilder stringBuilder = new StringBuilder(args);
      stringBuilder.deleteCharAt(i);
      string_char_permutation(stringBuilder, select + (args.charAt(i)));
    }
    //  StringBuilder stringBuilder = new StringBuilder("abc"); // Example input
    //     string_char_permutation(stringBuilder, "");
  }

  public static void NQueen_by_backdracking(char c[][], int row) {
    if (row == c.length) {
      for (int idx = 0; idx < c.length; idx++) {
        for (int i = 0; i < c.length; i++) {
          System.out.print(c[idx][i] + " ");
        }
        System.out.println("");
      }
      System.out.println("**************************");
      return;
    }
    boolean f = false;
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c.length; j++) {
        if (
          (!(row - j >= 0) || ((row - j >= 0) && c[row - j][i] == '_')) &&
          (!(row - j >= 0 && i - j >= 0) ||
            ((row - j >= 0 && i - j >= 0) && c[row - j][i - j] == '_')) &&
          (!(row - j >= 0 && i + j < c.length) ||
            ((row - j >= 0 && i + j < c.length) && c[row - j][i + j] == '_'))
        ) {
          f = true;
        } else {
          f = false;
          break;
        }
      }
      if (f) {
        c[row][i] = 'Q';
        NQueen_by_backdracking(c, row + 1);
        c[row][i] = '_';
        f = true;
      }
    }
    // char c[][]=new char[4][4];
    // for (int idx = 0; idx < c.length; idx++) {
    //     for (int i = 0; i < c.length; i++) {
    //         c[idx][i]='_';
    //     }

    // }
    // NQueen_by_backdracking(c ,0);

  }

  public static int grid_move_down_right(char mat[][], int i, int j) {
    if (i == mat.length - 1 && j == mat[0].length - 1) {
      return 1;
    }
    if (i > mat.length - 1 || j > mat[0].length - 1) {
      return 0;
    }
    int nextanswer =
      grid_move_down_right(mat, i, j + 1) + grid_move_down_right(mat, i + 1, j);
    return nextanswer;
    // Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the row of matrrix");
    //     int i= sc.nextInt();
    //     System.out.println("enter the coloumn of matrrix");
    //        int j = sc.nextInt();
    // char mat[][]=new char[i][j];

    // System.out.println(grid_move_down_right(mat, 0, 0));

  }

  public static void grid_move_down_right_optimize() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the row of matrrix");
    int i = sc.nextInt();
    System.out.println("enter the coloumn of matrrix");
    int j = sc.nextInt();
    int ans = factorial(i + j - 2) / (factorial(i - 1) * factorial(j - 1));
    System.out.println(ans);
  }

  public static boolean sudokosolver(int sudoko[][], int i, int j) {
    if (j == sudoko[0].length) {
      j = 0;
      i++;
    }

    if (i == sudoko.length) {
      return true;
    }

    if (sudoko[i][j] != 0) {
      return sudokosolver(sudoko, i, j + 1);
    }

    for (int k = 1; k < 10; k++) {
      if (issafe(sudoko, i, j, k)) {
        sudoko[i][j] = k; // Place k in the cell

        if (sudokosolver(sudoko, i, j + 1)) {
          return true;
        }

        sudoko[i][j] = 0;
      }
    }
    return false;
    //   int[][] sudokuGrid = {
    //             {5, 3, 0, 0, 7, 0, 0, 0, 0},
    //             {6, 0, 0, 1, 9, 5, 0, 0, 0},
    //             {0, 9, 8, 0, 0, 0, 0, 6, 0},
    //             {8, 0, 0, 0, 6, 0, 0, 0, 3},
    //             {4, 0, 0, 8, 0, 3, 0, 0, 1},
    //             {7, 0, 0, 0, 2, 0, 0, 0, 6},
    //             {0, 6, 0, 0, 0, 0, 2, 8, 0},
    //             {0, 0, 0, 4, 1, 9, 0, 0, 5},
    //             {0, 0, 0, 0, 8, 0, 0, 7, 9}
    //         };
    //  sudokosolver(sudokuGrid, 0, 0);
    //          print2Darray(sudokuGrid);

  }

  public static Boolean issafe(int sudoko[][], int i, int j, int k) {
    // Check the current row for k
    for (int l = 0; l < 9; l++) {
      if (sudoko[i][l] == k) {
        return false; // k is found in the row
      }
    }

    // Check the current column for k
    for (int l = 0; l < 9; l++) {
      if (sudoko[l][j] == k) {
        return false; // k is found in the column
      }
    }

    // Check the 3x3 box for k
    int boxRow = (i / 3) * 3;
    int boxCol = (j / 3) * 3;
    for (int l = 0; l < 3; l++) {
      for (int m = 0; m < 3; m++) {
        if (sudoko[boxRow + l][boxCol + m] == k) {
          return false; // k is found in the 3x3 box
        }
      }
    }

    return true; // k can be placed safely
  }

  public static void main(String atgs[]) {}

  public static void print2Darray(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
  }
}
