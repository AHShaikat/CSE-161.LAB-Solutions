//Basic calculator
  import java.util.Scanner;
public class java {
  public static void main (String[]args){
    Scanner value = new Scanner (System.in);
      float x;
      float y;
      float sum,min,mul,div;
      
     System.out.println("Enter the value of x");
    x= value.nextFloat();
    System.out.println("The value of x is " +x);
    
    System.out.println("Enter the value of y");
    y= value.nextFloat();
    System.out.println("The value of x is\n " +y);
    
      sum = x + y ;  
      min = x - y ;
      mul = x * y ;
      div = x / y ;
      
   System.out.println("The value of sum is " +sum);   
      System.out.println("The value of min is " +min);   
         System.out.println("The value of mul is " +mul);   
           System.out.println("The value of div is " +div);  
           
  }}
    