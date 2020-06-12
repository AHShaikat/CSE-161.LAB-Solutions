import java.util.Scanner;
public class Lab09Task10 {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        int []a=new int [10];
        for (int i=0;i<a.length ;i++){
            System.out.println("Please enter a number");
            a[i]=sc.nextInt();
            
            for (int k=0;k<=i;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}