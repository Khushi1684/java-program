import java.util.Scanner;
public class Armstrong{
     static int count(int num){
        int a=0;
        while(num!=0){
            num/=10;
            a++;
         }
        return a;

    }
    static  int pow (int x,int y){
        int s=1;
        for(int i=1;i<=y;i++){
          s=x*y;
         }
         return s;

     

      }
      static int Armstrong(int num){
        int sum=0;
        int a=count(num);
        
        while (num!=0){
            int res=num%10;
            sum=sum+pow(res,a);
            num/=10;
        }
         return sum;
        }
        public static void main(PairOfString[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enetr a number");
         int num=sc.nextInt();
         System.out.println("Count:"+count(num));
         System.out.println("power --"+pow(num,count(num)));
         System.out.println("power --"+Armstrong(num));
         if (Armstrong(num)!=num){
            System.out.println("it's armstrong");}
         else {
            System.out.println("not armstrong");
         }
         

        sc.close();



        }
      }

      


      
    


