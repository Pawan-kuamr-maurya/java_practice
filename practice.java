
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

  public static void print_subarray_and_there_sum() {

        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,tem=0;
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int  array[]=new int[num];
        int  copy[]=new int[num];
for (int i = 0; i < num; i++) { array[i]=sc.nextInt();} 
for (int i = 0; i < num; i++) { if(i==0){copy[i]=array[i];}else{copy[i]=copy[i-1]+array[i];}} 
for (int i = 0; i < num; i++) { System.out.print(" "+copy[i]);} 
for (int i = 0; i < num; i++) {
    for (int j = i+1; j < num; j++) {
       
        System.out.print("(");
        System.out.print(array[i]+","+array[j]);
        if(i==0){tem=copy[j];}
        else{ tem=copy[j]-copy[i-1];}
       
        System.out.print(")="+tem+" ");
       

    
    }
    System.out.println("");}
}

    public static void trapingwater() {
      Scanner sc= new Scanner(System.in);
   System.out.println(" enter the length of array");
int num=sc.nextInt();
int  array[]=new int[num];
int  rightmax[]=new int[num];
int  leftmax[]=new int[num];
for (int i = 0; i < num; i++) {
    array[i]=sc.nextInt();
}
int rightmaxval=Integer.MIN_VALUE,leftmaxval=Integer.MIN_VALUE;
for (int i = 1; i < num-1; i++) {
 
    if(array[num-i]>rightmaxval){
        rightmaxval=array[num-i];  }
         rightmax[num-i-1]=rightmaxval;
      if(array[i-1]>leftmaxval){
         leftmaxval=array[i-1];
      } leftmax[i]=leftmaxval;
}


int water=0 , tem=0;
for (int i = 0; i < num; i++) {
    if(i==0||i==num-1){
        continue;
    }
    tem=Math.min(rightmax[i],leftmax[i]);
    if(tem>array[i]){
        tem=tem-array[i];
    }else{
         tem=0;
    }
  
    water=tem+water;
      tem=0;
}
System.err.println(water);
}
    public static void stocks_buy_sell_profit() { // bad way to do it dont use it 
         Scanner sc= new Scanner(System.in);
        System.out.println(" enter the length of array");
        int num=sc.nextInt();
         int  array[]=new int[num];
         for (int i = 0; i < num; i++) { array[i]=sc.nextInt();} 
        int  leftbiggest[]=new int[num],leftbiggestday[]=new int[num],day=-1,tem=Integer.MIN_VALUE;
for (int i = num-1; i >= 0; i--) {
    if(array[i]>tem){
        tem=array[i];
        day=i;
    }
    leftbiggest[i]=tem;
    leftbiggestday[i]=day;
}
 day=-1 ;tem=-1;
 int profit=Integer.MIN_VALUE;
for (int i = 0; i < num; i++) {
    if(leftbiggest[i]-array[i]>profit){
        profit=leftbiggest[i]-array[i];
        day=i;
        tem=leftbiggestday[i];
    }
}
System.out.println("start: "+day+"\n"+"end: "+tem+"\n profit: "+profit );

}

    public static void main(String atgs[]){
 
    }
}
