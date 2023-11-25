
import java.util.Scanner;
public class Employee_detail { 
    

   
        static float hra(float b) {
            float hra;
            hra = b * (30 / 100);
            return (hra);
        }

        static float ta(float b) {
            float ta;
            ta = b * (20 / 100);
            return (ta);

        }

        static float da(float b) {
            float da;
            da = b * (10 / 100);
            return (da);

        }

        static float net(float b, float pf) {
            float netsal;
            netsal = b + hra(b) + da(b) + ta(b) - pf;
            return netsal;
        }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary");
        float b = sc.nextFloat();
        System.out.println("Enter basic pf");
        float pf = sc.nextFloat();
        System.out.println(net(b, pf));
        sc.close();

    }




    }
    
