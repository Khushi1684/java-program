import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome in my calculator");
        System.out.println("Enter your choice");
        System.out.println("for addition choose 1");
        System.out.println("for subtraction choose 2");
        System.out.println("for multipliction choose 3");
        System.out.println("for division choose 4");
        int de=sc.nextInt();
        System.out.println("enter the first number");
        int sr=sc.nextInt();
        System.out.println("enter the second number");
        int ar=sc.nextInt();
        switch(de){
            case 1:
                    System.out.println("Addition operation");
                    int add=sr+ar;
                    System.out.println("the addition is "+add);
                     break;
             case 2:
                   System.out.println("subtraction operation");
                   int sub=sr-ar;
               System.out.println("the subtaction"+sub);
               break;
             case 3:
            System.out.println("multiplication operation");
             int mul=sr*ar;
               System.out.println("the multiplication"+mul);
               break;
             case 4:
            System.out.println("division operation");
             int div=sr/ar;
               System.out.println("the division"+div);
               break;
            default:
            System.out.println("invalid choice");


        }sc.close();
         
           
           

           

           

    }
    
}
