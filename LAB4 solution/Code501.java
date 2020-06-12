import java.util.Scanner;
public class Code501{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a quantity");
    int x=sc.nextInt();
    int i=1;
    while(i<=x){
      System.out.println("Enter a number");
      int y=sc.nextInt();
      if(y%2==0){
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }
      i++;
    }
  }
}
      