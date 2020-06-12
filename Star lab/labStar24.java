import java.util.Scanner;
 
class labStar24{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
     
    System.out.print("Enter a number");
    int n = obj.nextInt();
     
    for(int i=1, r=n; i<=(2*n-1); i++){
      if(i<=n){
        System.out.print(i);
      }
      else{
        System.out.print(--r);
      }
     }
    System.out.println();
  }
}