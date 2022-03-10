import java.io.*;
import java.util.*;

public class Methods {
  public static boolean isDivisible(int n, int m){
    return n % m ==0;
    }

  
  public static boolean isTriangle(int a, int b, int c){
    if (a+b>c && b+c>a && a+c>b){
      return true;
    } else {
      return false;
    }
  }

  public static int ack(int m, int n){
    if (m==0) {
      return n+1;
    
        if (n==0){
          m=m-1;
          n = 1;
          return ack(m,n); 
        } else {
          return -1;
        }
      
    }
  }
  
  public static void main(String[]arugs){
    System.out.println(ack (2,0));
  }
  
}  
