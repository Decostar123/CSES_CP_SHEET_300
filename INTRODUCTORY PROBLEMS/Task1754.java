import java.util.*;
import java.io.*   ; 

 class Task1754{ 
        public static void main (String[] args) throws IOException  {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ; 
            long t   = Long.parseLong( br.readLine() ) ; 
            BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
        
            while( t-- > 0 ){
              
              String str = br.readLine() ; 
              String[] arr = str.split(" ") ; 
              long a   = Long.parseLong( arr[0] ) ; 
              long b   = Long.parseLong( arr[1] ) ; 
              if(a < b){
                long  k = a ; a = b ; b = k ; 
              }
              long c = a - b ; 
              a = a-2*c ; 
              b = b - c  ; 
              
              if( a < 0 || b < 0 ){
                bw.write("NO") ; 
              }else if( a%3 != 0 ){
                bw.write("NO") ; 
              }else{
                bw.write("YES") ; 
              }
              
               bw.newLine() ; 
      
             
               
            }
             br.close() ; 
              bw.close(); 
        
          
        }
} 