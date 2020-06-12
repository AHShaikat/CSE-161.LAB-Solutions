import java.util.Scanner; 
public class labStar11 { 
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
    int c=x, m=x;
  
    for ( int row=1; row<=x ; row++) {
      for( int col = 1; col<=x-row ; col++) {
        System.out.print(" ");
      } 
      for( int col = 1; col<=row ; col++) {
        
        System.out.print(c);
        c++;
      }
      m--;
      c=m;
      
      System.out.println();
    }  
  }
}