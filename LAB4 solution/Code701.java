import java.util.Scanner;
public class Code701{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i=1, counter=0;
    System.out.println("Enter a number");
    int n=sc.nextInt();
    while(i<=n){
      if(n%i==0){
        System.out.print(i+ ",");
        counter++;
      }
      i++;
    }
    System.out.println("divisor:"+ counter);
  }
}