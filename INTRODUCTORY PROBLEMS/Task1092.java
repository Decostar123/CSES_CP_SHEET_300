import java.util.*;
import java.io.*   ; 
class Task1092{
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ; 
      long n   = Long.parseLong( br.readLine() ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
      long sum = ( n * ( n + 1 ))   ; 
     if( n == 3){
       bw.write("YES") ; 
       bw.newLine() ; 
 	bw.write("2") ; 
       bw.newLine() ; 
        bw.write("1 2 ") ; 
         bw.newLine() ; 
	bw.write("1") ;
	 bw.newLine() ; 
         bw.write("3") ; 
         bw.newLine() ; 
         bw.close() ; 
         br.close() ; 
         return ;
        
     }
      if( sum%4 != 0 ){
        bw.write("NO") ; 
        bw.newLine() ; 
      }else{
        bw.write("YES") ; 
        bw.newLine() ; 
        
        if( n%2 == 0 ){
          long a = n/2  ;
          bw.write(Long.toString( a )) ;
          bw.newLine() ; 
          long i = 1 , j = n ; 
          while( i <  j ){
            bw.write( Long.toString(i) + " ") ; 
            bw.write( Long.toString(j) + " " ) ;
            i+=2 ; 
            j-=2 ; 
          }
           bw.newLine() ;
          bw.write(Long.toString( a )) ;
          bw.newLine() ; 
           i = 2  ;  j = n-1 ; 
          while( i <  j ){
            bw.write( Long.toString(i) + " ") ; 
            bw.write( Long.toString(j) + " " ) ;
            i+=2 ; 
            j-=2 ; 
          }
           bw.newLine() ;
          
          
        
          }else{
             long a = n/2  ;
                bw.write(Long.toString( a + 1  )) ;
                bw.newLine() ; 
                bw.write("1 2 ") ; 
                 long i = 4 , j = n ; 
                  while( i <  j ){
                bw.write( Long.toString(i) + " ") ; 
                bw.write( Long.toString(j) + " " ) ;
                i+=2 ; 
                j-=2 ; 
              }
              bw.newLine() ;
              bw.write(Long.toString( a )) ;
              bw.newLine() ; 
              bw.write("3 ") ; 
              i = 5 ; j = n-1 ; 
               while( i <  j ){
                bw.write( Long.toString(i) + " ") ; 
                bw.write( Long.toString(j) + " ") ;
                i+=2 ; 
                j-=2 ; 
              }
               bw.newLine() ;
              
              
            
            
          }
      
      }
      
      br.close() ; 
      bw.close(); 
    }
      
}