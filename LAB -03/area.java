import java.util.Scanner;
public class area {
  public static void main(String[]args){
    Scanner value = new Scanner (System.in);
  
   float pi = 3.1416f;
      float area;
    System.out.println("Enter the radius");
      float r = value.nextFloat();
     System.out.println("the radius" + r);
      
    area = (pi * r * r); 
    System.out.println("Area of the circle:" +area );
  }}
     
                         
          