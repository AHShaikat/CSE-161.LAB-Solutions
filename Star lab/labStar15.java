import java.util.Scanner; 
public class labStar15 { 
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height :");
    int x = sc.nextInt(); 
    System.out.print("Enter Width :");
    int y = sc.nextInt();
    
    for (int i = 1; i <= x; i++) 
    { 
      for (int j = 1; j <= y; j++) 
      { 
        if (i==1 || i==x || j==1 || j==y)             
          System.out.print(j);             
        else
          System.out.print(" ");             
      } 
      System.out.println(); 
    }
    System.out.println();
  }
}


