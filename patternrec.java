public class patternrec {
    static void printRow(int starcount){
        if (starcount==0){
            return;
        }
        System.out.print("*");
        printRow(starcount -1);
    }
 static void printpattern(int col,int row)
    {
          if (row == 0){
          return;
    }
         printRow(col);
         System.out.println();
         printpattern(col, row-1);
}  
     public static void main(PairOfString[]args){
        printpattern(5,5);
  }            
}
    

