
import java.io.*  ; 
import java.util.* ; 
class Task1622{ 

    public static void main (String[] args) throws Exception {
        
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in)  ) ; 
      BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) ) ;
      
      String str =br.readLine()  ;
      
      HashSet<String> set = new HashSet<>() ; 
      
      solve(  str, set, new HashSet<Integer>() , "" ) ;
      
      int len = set.size() ; 
      ArrayList<String> arr = new ArrayList<>( set ) ; 
      Collections.sort( arr ) ; 
       bw.write( "" + len ) ; 
       bw.newLine() ; 
       for( String ans : arr ){
           bw.write( ans  ) ; 
          
           bw.newLine() ; 
       }
       
       bw.close() ; 
       br.close() ; 
      
      
    }

    static void solve( String str, HashSet<String> set, HashSet<Integer> indices , String res  ){
      
      
      if( res.length() ==  str.length()){
        set.add(res) ;
        return  ; 
      }
        
        for( int i = 0 ; i < str.length() ; i++ ){
            if( indices.contains(i) ) continue ;;
            
            char ch = str.charAt(i) ; 
            indices.add(i); 
            solve( str, set , indices, res + ch ) ; 
            indices.remove(i) ; 
            
        }
    }
    
} 