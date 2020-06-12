import java.util.Scanner; 
public class condition {
  public static void main (String[] args ){
    Scanner sc = new Scanner(System.in);
    
    System.out.println( " Enter the number -1");
    float x = sc.nextFloat();
    System.out.println( "the number is:"+x);
    
    System.out.println( " Enter the number -1");
    float y = sc.nextFloat();
    System.out.println( "the number is:"+y);
    
    if (x>y)
    {
      System.out.println( "the number bigger");
    }
    else
    {System.out.println( "the number smaller");}
  }}
    