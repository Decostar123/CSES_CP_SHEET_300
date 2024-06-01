import java.util.* ; 

class Pblm1070 { 

   public static void main (String[] args) {
    Scanner abc = new Scanner( System.in) ; 
    int n = abc.nextInt() ; 
    permutation( n ) ; 
    System.out.println();
    
  }
   static void permutation(int N) {
        // Check if N is 2 or 3, as a beautiful permutation is
        // not possible for these cases
        if (N == 2 || N == 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        
        // Output all even numbers first
        for (int i = 2; i <= N; i += 2) {
            // Print even numbers with a step of 2
            System.out.print(i + " ");
        }
        
        // Output all odd numbers next
        for (int i = 1; i <= N; i += 2) {
            // Print odd numbers with a step of 2
            System.out.print(i + " ");
        }
    
  }
} 