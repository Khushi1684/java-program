import java.util.Scanner;
public class Trafficlight {
    public static void main(PairOfString[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("1.Red");
        System.out.println("2.Yellow");
        System.out.println("3.Green");
        int n=sc.nextInt();
        switch(n)
        {
case 1:{
System.out.println("red");
break;
}
case 2:{
System.out.println("yellow");
break;
}
case 3:{
System.out.println("green");
break;
}
        }
        sc.close();
    }
    }
    
    

