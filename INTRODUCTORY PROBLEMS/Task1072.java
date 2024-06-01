import java.util.*;
import java.io.*   ; 
class Task1072{
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ; 
      int k  = Integer.parseInt( br.readLine() ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
     
     for( int i = 1 ; i <= k ; i++ )
     {
        long p = i  ; 
        long m = p*p ; 
        // SUBTRACTING THE INCORRECT WAYS 
        
        long ways =  ( m * ( m-1 ) ) / 2 - ( p-1 )*( p-2 )*4 ; 
        bw.write( Long.toString(ways)  ) ;
        bw.newLine(); 
        
      }
      bw.close() ; 
      br.close() ; 
    
  }
}