import java.util.*;

class Pblm2 {
    public static void main(String[] args) {
      Scanner abc = new Scanner( System.in)  ; 
      long n = abc.nextLong() ; 
   
      abc.nextLine()  ; 
      String str = abc.nextLine() ; 
        long sum = ( n * ( n + 1 ) ) /  2  ; 
        
        for( String num : str.split(" ") ){
          int val = Integer.parseInt( num ) ; 
          sum = sum  - val ; 
        }
      
      System.out.println( sum ) ; 
  }
}