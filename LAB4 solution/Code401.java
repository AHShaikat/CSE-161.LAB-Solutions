import java.util.Scanner;
public class Code401{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i=1;
    while(i<=20){
      System.out.println("Enter a number");
      int n=sc.nextInt();
      if(n%2==0){
        System.out.println(n + "is Even");
      }
      else{
        System.out.println(n + "is Odd");
      }
      i++;
    }
  }
}