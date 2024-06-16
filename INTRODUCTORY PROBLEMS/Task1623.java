
import java.io.*  ; 
import java.util.* ; 
class Task1623 { 

    public static void main (String[] args) throws Exception {
        
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)  ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) ) ;
      
      int n  = Integer.parseInt( br.readLine() )   ;
      int[] arr = new int[n] ;
      
      String stringNum = br.readLine(); 
      long sum = 0 ; 
      int i = 0  ;
      for( String ele : stringNum.split(" ") ){
       arr[i] = Integer.parseInt( ele ) ; 
        sum += arr[i] ; 
        i++ ;
        
      }
      
      long  ans = solve( n , arr, 0, sum , 0 ) ; 
      
      bw.write("" + ans )  ;   
    
      bw.newLine() ; 
       bw.close() ; 
       br.close() ; 
      
      
    }

    static long  solve( int n , int[] arr, int ind ,  long sum , long curr  ){
      
      
      if( ind == n ){
        long curr2 = sum - curr; 
        long diff = curr2 - curr  ; 

        long ans = Math.abs( diff  ) ; 
        return ans  ; 
      }
      long  res1 = solve( n , arr, ind+ 1 , sum , curr + arr[ind] ) ; 
      long res2 = solve( n , arr, ind + 1 , sum , curr ) ; 
      return Math.min( res1  , res2 ) ; 
      
     
    }
    
    
} 