import java.io.* ; 
import java.util.* ; 
class Task2205{ 

    public static void main (String[] args) throws IOException  {
      
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)  ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) ) ;
      
      int n = Integer.parseInt( br.readLine()) ; 
    
      List<String> ans = solve( n ) ; 
      for( String res : ans ){
        bw.write( res ) ; 
        bw.newLine() ; 
        
      }
      
      br.close() ; 
      bw.flush();  
      
    }
    
   static List<String> solve( int n  ){
     
     if( n == 1 ){
       List<String> ans = new ArrayList<>() ; 
       ans.add("0"); 
       ans.add("1") ; 
       return ans ; 
     }
     
     List<String> ans = solve( n-1  ) ; 
     int len = ans.size() ; 
     
     for( int i = len -1 ; i >=0 ; i--){
       ans.add( ans.get(i)) ; 
     }
     for( int i = 0 ; i < len ; i++ ){
       ans.set( i , ans.get(i) + "0") ; 
     }
     
     
     for( int i = len ; i < 2*len ; i++ ){
       ans.set( i , ans.get(i) + "1") ; 
     } 
     
     return ans ; 
   }
   
} 