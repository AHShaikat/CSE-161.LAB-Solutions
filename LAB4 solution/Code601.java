import java.util.Scanner;
public class Code601{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a quantity");
    int q=sc.nextInt();
    System.out.println("Enter a number");
    int x=sc.nextInt();
    int i=1;
    int max=x, min=x, sum=x;
    while(i<=q){
      System.out.println("Enter a number");
      int y=sc.nextInt();
      if(y>max){
        max=y;
      }
      else if(y<min){
        min=y;
      }
      sum+=y;
      i++;
    }
    float avg=sum/q;
    System.out.println("Max:"+max);
    System.out.println("Min:"+min);
    System.out.println("Avg:"+avg);
  }
}