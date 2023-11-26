public class Recursion {
    
     void printDigit(int n){

    //base condition(stop condition) 
     if(n==0){
        return ;
     }  
        
        
        //this is processing logic
       

         //small problem
         printDigit(n-1);

           System.out.println(n);

     }
   
   public static void main(PairOfString[]args){
    Recursion obj= new Recursion();
    obj.printDigit(10);
   }
}
