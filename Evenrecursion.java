 import java.util.Scanner;
 public class Evenrecursion {
 static void num(int n){
      if(n==0)
       {
         return;
       } 
      num(n-1);
     if(n%2==0)
  {
    System.out.println(n);
 }
     }
    public static void main(PairOfString[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the range:");
        int n=sc.nextInt();
        System.out.println("Even number");

      num(n);   
    }
    
}
