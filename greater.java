import java.util.Scanner;
public class greater {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 number");
    int r1=sc.nextInt();
    int r2=sc.nextInt();
    int r3=sc.nextInt();
   int z=(r1>r2)?((r1>r3)?r1:r3):((r2>r3)?r2:r3);
   System.out.println("your no is greater"+z);

    }
    
}
