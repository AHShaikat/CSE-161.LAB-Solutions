 import java.util.Scanner; 
public class labStar09 { 
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
  
    for ( int i=1; i<=x ; i++) {
      for( int j = 1; j<=x-i ; j++) {
        System.out.print(" ");
      } 
      for( int j = 1; j<=((2*i)-1) ; j++) {
        System.out.print("*");
      }
      System.out.println( );
      } 
      
    }  
  }