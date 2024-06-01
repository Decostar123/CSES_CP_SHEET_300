import java.util.*;

class Pblm4 {
    public static void main(String[] args) {
      Scanner abc = new Scanner( System.in)  ; 
     int n = abc.nextInt() ; 
     abc.nextLine() ; 
     String str = abc.nextLine() ;
     int prev  = -1 ; 
     long ans = 0 ; 
     for( String temp : str.split(" ")){
       int num = Integer.parseInt( temp ) ; 
       int val = num ;  
       if( prev == -1 ){
         prev = num ; 
       }else{
         if( num < prev ){
           ans += prev - num ; 
	   val = prev ; 
           
         }
         prev = val;
       }
     }
     System.out.println( ans  ) ;
      
      
  }
}