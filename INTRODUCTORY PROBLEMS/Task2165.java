import java.io.* ; 
import java.util.* ; 
class Task2165{ 

    public static void main (String[] args) throws IOException  {
      
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)  ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) ) ;
      
      int n = Integer.parseInt( br.readLine()) ; 
    
      List<String> arr = new ArrayList<>() ; 
       int res = solve( n , 1, 2 , 3 , arr  ) ; 
      
      bw.write("" + res ) ; 
      bw.newLine() ; 
      
      for( String temp : arr ){
        bw.write( temp ) ; 
        bw.newLine() ; 
      }
      
      br.close() ; 
      bw.flush();  
      
    }
    
   static  int solve( int n  , int a , int b , int c , List<String> arr   ){
     
      if( n == 1 ){
          arr.add(a + " " + c ) ; 
          return 1  ; 
      }
      int ans1 = solve( n-1, a , c , b  , arr) ; 
      
      arr.add(a + " " + c ) ; 
      
      int ans2 = solve( n-1, b ,  a   , c  , arr) ; 
      
      return ans1 + ans2 + 1 ; 
     
   }
   
} 