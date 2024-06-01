import java.util.*;
import java.io.*   ; 
class Task1618{
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ; 
      long n   = Long.parseLong( br.readLine() ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
      
     long ans  = 0 ; 
     while( n > 0  ){
        long a = n/ 5  ; 
        ans += a ; 
        n= a ; 
        
     }
     bw.write("" + ans ) ; 
     bw.newLine()  ; 
     bw.close() ; 
     br.close() ; 
  
    }
   
      
}