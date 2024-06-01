import java.util.*;

class Pblm3{
    public static void main(String[] args) {
      Scanner abc = new Scanner( System.in)  ; 
     
      String str = abc.nextLine() ; 
      int n = str.length() ; 
      int i  =0 ; 
      int ans = 0  ; 
      while( i < n ){
        int j = i ; 
        int cnt =  0 ;
        while( j < n && str.charAt(j) == str.charAt(i) ){
          cnt++ ; j++ ; 
        }
        ans = Math.max( ans  , cnt ) ; 
        i = j ; 
      }
      System.out.println(ans);
  }
}