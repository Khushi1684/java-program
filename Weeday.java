 import java.util.Scanner;
 public class  Weeday {
    public static void main(PairOfString[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the day");
      int day=sc.nextInt();
       switch(day%7)
       {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        {System.out.println("WORK DAYS");break;}
        case 6:
        case 7:
        System.out.println("WEEK END");
        default:System.out.println("wrong choice");
          }
    
        
       }
    }
    
