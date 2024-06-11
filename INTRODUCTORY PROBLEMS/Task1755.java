import java.util.*;
import java.io.*   ; 

class Task1755{ 
    
      public static void main (String[] args) throws IOException {
           BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ; 
           BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
           String str = br.readLine() ; 
           int[] arr = new int[26] ; 
           for( char ch : str.toCharArray() ){
             arr[ch-'A']++  ; 
           }
          int cnt = 0 ; 
           for( int val : arr ){
             if( val%2 != 0 ) cnt++  ;
           }
          if( cnt >=2 ){
              bw.write("NO SOLUTION") ; 
          } else{
              
               cnt= 0 ; char ch = 'A' ; 
               int ind  = 0 ; 
              for( int i = 0 ; i < 26 ; i++ ){
                int freq = arr[i] ; 
                if( freq%2 != 0 ){
                  cnt = freq ; 
                  ch =  (char)('A' +  i)   ;
                  ind = i ; 
                  continue ; 
                  
                }
                
                while( arr[i] > freq/2 ){
                  bw.write( (char)('A'+ i)  ) ; 
                  arr[i]-- ; 
                }
              }
              
              while( cnt > 0 ){
                bw.write( ch ) ; 
                cnt-- ; 
                arr[ind]-- ; 
              }
              
                for( int i = 25 ; i >=0 ; i-- ){
                int freq = arr[i] ; 
                
               
                
                while( freq > 0  ){
                  // bw.write( i + "" ) ; 
                  bw.write( (char)('A'+ i)  ) ; 
                  freq-- ; 
                }
              }
              
          }
          
          bw.newLine() ; 
          br.close() ; 
          bw.close() ; 
          
        
      }
} 