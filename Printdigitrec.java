import java.util.*;
public class Printdigitrec {
    static void num(int n){
        if (n==0){
        return;
    }
    else{
        num(n/10);
        System.out.println(n%10);
    }
 }
    public static void main(PairOfString[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
            int n=sc.nextInt();
            System.out.println("digit");
    
         num(n);   
        }

    
}
