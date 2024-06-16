import java.io.*  ;
  

class Task2431{ 

  public static void main (String[] args)  throws Exception {
   BufferedReader br = new BufferedReader( new InputStreamReader(System.in)  ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) ) ;
      
      int q = Integer.parseInt( br.readLine()) ; 
      while( q-- > 0 ){
        long k = Long.parseLong( br.readLine()) ; 
        long ans= solve( k ) ;
        bw.write("" + ans )  ; 
        bw.newLine() ;
        
      }
      br.close() ; 
      bw.close() ; 
      
  }
  
  static long power( long a  ,long b ){
    
    long ans = 1  ;
    long pow = a ; 
    while( b > 0 ){
      long res = b&(1l) ;
      if( res != 0 ){
        ans = ans*pow  ;
      }
      b  = b >> 1 ; 
      pow = pow*pow ; 
    }
    return ans ; 
  }
  static long solve( long N){
    long digits = 1; 
    long base = 9 ; 
    while( N - ( digits*base ) > 0 ){
       N = N - digits*base ; 
       base = base * 10  ; 
       digits++ ; 
    }
    
    
    long num = power( 10 , digits - 1) + ( N-1 )/digits ;
    
    // WE CAN DIRECTLY GET TH INDEX AFTER ADDIGN AND TRAVELLINGT HE NUMBER 
    // AS WE ONLY HAVE HAVE 10^ 18 NUNBERS , THA WILL ALO WORK 
    long index = N%digits ; 
    
    if( index != 0 ){
      num = num / ( power( 10 ,  digits - index ) ) ; 
    }
    return num%10 ; 
  }
} 