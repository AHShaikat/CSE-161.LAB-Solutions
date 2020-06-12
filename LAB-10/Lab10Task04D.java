import java.util.Scanner;
public class Lab10Task04D{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for(int i=0; i<a.length; i++){
      a[i]=sc.nextInt();
    }
    for(int i=0; i<a.length; i++){
      int min=a[i]; int loc=i;
      for(int j=1+i; j<a.length; j++){
        if(a[j]<min){
          min=a[j];
          loc=j;
        }
      }
        int temp=a[i];
        a[i]=a[loc];
        a[loc]=temp;
        System.out.print(min+",");
    }
  }
}