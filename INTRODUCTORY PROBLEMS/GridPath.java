import java.util.* ; 
import java.io.* ;

public class GridPath{ 

  public static void main (String[] args) throws Exception {
    /* code */
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ; 
    
    BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
    
    String str = br.readLine() ; 
    
    visited = new int[8][8] ; 
    
    int[][][] dp = new int[8][8][49] ; 
    for( int[][] arr : dp ){
      for( int[] brr : arr ){
         Arrays.fill( brr , -1 ) ; 
      }
    }
    
    int ans = solve( str, 0,0, 0,  dp, bw ) ; 
    
    bw.write( "" +  ans ) ; 
    bw.newLine() ; 
    br.close()  ;
    bw.close() ; 
    
    
    
    
    
  }
  static int solve( String str , int i , int j, int ind ,  int[][][] dp,  BufferedWriter bw ) throws Exception{
    
    bw.write( i +" "  + j + " ") ; 
    bw.newLine() ; 
    
    if( i < 0 || j < 0 || i >=7 || j >=7 ) return 0 ; 
    
    if( ind == str.length() ){
     
      if( i == 6 && j == 0 ) {
        // bw.write("" + 1  ) ;
        return 1 ; 
         
      }
      return 0 ; 
    }
    
    if( visited[i][j] == 1 ) return 0 ; 
    
    visited[i][j] = 1 ; 
    
    
    if( dp[i][j][ind] != -1  )  return dp[i][j][ind] ; 
    
    int ans = 0 ; 
    char ch = str.charAt(ind) ; 
    
    if( ch == '?' ){
      
      
        int ans1 = solve( str , i-1 , j , ind + 1 ,  dp , bw) ; 
        int ans2 = solve( str , i , j + 1 , ind + 1 ,  dp , bw) ; 
        int ans3 = solve( str , i+1 , j , ind + 1 ,  dp , bw) ; 
        int ans4 = solve( str , i , j -1 , ind + 1 ,  dp , bw) ;
        
        ans = ans + ans1 + ans2 + ans3 + ans4 ; 
     
    }else{
      
      int dir1 = getDirectionsRow( ch ) , dir2 = getDirectionsCol( ch ) ;
      
      dir1 += i ; 
      dir2 += j ; 
      
      int path = 0 ; 
      if( ch == 'R' ) path = 1 ; 
      if( ch == 'D' ) path = 2 ; 
      if( ch == 'L' ) path = 3 ; 
      int ans1 = solve( str , dir1, dir2 , ind+1 ,  dp, bw  ) ; 
      ans += ans1  ; 
      
    }
    
    visited[i][j] = 0 ; 
    dp[i][j][ind] = ans ;
    
    // bw.write("" + i + " "  + j + " " + ind + " " + ans ) ;
    // bw.newLine(); 
    return ans ; 
    
  }
  
  static int getDirectionsRow( char ch ){
    if( ch == 'D' ) return  1 ; 
    if( ch == 'U' ) return  -1 ; 
    
    return 0  ;
  }
  
  
  static int getDirectionsCol( char ch ){
    if( ch == 'R' ) return  1 ; 
    if( ch == 'L' ) return  -1 ; 
    
    return 0  ;
  }
} 