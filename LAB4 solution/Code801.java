import java.util.Scanner;
public class Code801{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int i=1, sum=0;
    while(i<n){
      if(n%i==0){
        sum+=i;
      }
      i++;
    }
    if(n==sum){
      System.out.println(n+ "is Perfect");
    }
    else{
      System.out.println(n+ "is not perfect");
    }
  }
}
        