
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


    public static void main(String atgs[]){
 
    }
}
