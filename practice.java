
import java.util.Arrays;
import java.util.Scanner;






public class pk{

public static void fact(int n) {
    int bin=1,num=0;
    while (n > 0) {
        if (n % 2 != 0) {
           num= bin+num;
            System.err.println("*"+bin);
        } 
        bin=bin*10;
        n = n / 2;
    }
    System.err.println(num);
}
    public  static  int  bintoint(int n){
    int dec=0;
    int tem,i=0;
    while(n>0){
        tem = n % 10;
        if(tem==1){
            dec=dec+ (int)Math.pow(2,i);
        }
        i++;
        n=n/10;
    }
    return dec;
}

public static void printbutterfly(){
     Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();
     int col=sc.nextInt();
     int n=1,count=1;
for (int i = 0; i < num; i++) {
    for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    
    for (int j = 0; j < 2*(num-i); j++) {
        System.out.print(" ");
    }
     for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    System.out.println(" ");
}
for (int i = num; i >0 ; i--) {
    for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    
    for (int j = 0; j < 2*(num-i); j++) {
        System.out.print(" ");
    }
     for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    System.out.println(" ");
}

}

    public static void dimond(){
     Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();

     for (int i = 0; i < num; i++) {
         for (int j = 0; j < num; j++) {
            if(j<num-i) {System.out.print(" ");}
             else{System.out.print("*");}
         }
          for (int j = 0; j < i; j++) {
            
             System.out.print("*");
         }
          System.err.println("");
     }
       for (int i =num; i >0; i--) {
         for (int j = 0; j < num; j++) {
            if(j<num-i) {System.out.print(" ");}
             else{System.out.print("*");}
         }
          for (int j = 0; j < i; j++) {
            
             System.out.print("*");
         }
          System.err.println("");
     }
}
public static  void reverse(){
     Scanner sc= new Scanner(System.in);
     
     System.out.println(" enter the length of array");
        int num=sc.nextInt();
          int  array[]=new int[num];
       for (int i = 0; i < num; i++) {
           array[i]=sc.nextInt();
        }

int tem=0;
   for (int i = 0; i < num/2; i++) {
       tem=array[i];
      array[i] =array[num-i-1];
       array[num-i-1]=tem;} 
for (int i = 0; i < num; i++) {
    System.out.println(array[i]);} }


    public static void main(String atgs[]){
 
    }
}
