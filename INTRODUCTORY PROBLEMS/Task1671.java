import java.util.*;
import java.io.*   ; 
class Task1671 {
  static long MOD = (long)Math.pow( 10 , 9 ) + 7 ; 
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ; 
      long n   = Long.parseLong( br.readLine() ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
      
      long ans = solve( n ) ; 
      bw.write(""+ans) ; 
      bw.newLine() ; 
      
      br.close() ; 
      bw.close(); 
    }
    static long  solve( long n){
    
      if( n == 1l ) return 2l ; 
     
      long a = n%2 == 0 ? 1 : 2 ; 
      
      long ans = solve( n / 2 )    ; 
      ans = (  ( ans * ans )%MOD  * a ) % MOD ; 
      return ans ; 
      
      
    }
      
}