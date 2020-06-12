import java.util.Scanner;
public class Code1001{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int i=1, div=0;
    if((n>=40) && (n<=50)){
      while(i<=n){
      if(n%i==0){
        div++;
      }
      i++;
      }
      if(div==2){
        System.out.println(n+ "is prime");
      }
      else{
        System.out.println(n+ "is not prime");
      }
    }
  }
}