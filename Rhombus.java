public class Rhombus {
    public static void main(String[]args)
    {
        for(int i=1;i<=4;i++)//loop
        {
            for (int j=1;j<i;j++) //space e liye
            {
                System.out.print(" ");
            }
            for(int j=1;j<=4;j++)//loop
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
