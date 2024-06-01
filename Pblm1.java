import java.util.*;

class Pblm1{
    public static void main(String[] args) {
      Scanner abc = new Scanner( System.in)  ; 
      long n = abc.nextLong() ; 
      long ans = 0 ; 
      while( n != 1 ){
        System.out.print( n + " " ) ; 
        long a = n & 1l ;
        if( a == 0 ){
          n = n/2 ; 
         
        }else{
          n = 3*n + 1  ;
        }
        
      }
      System.out.print( 1 ) ; 
      System.out.println() ; 
  }
}