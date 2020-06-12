import java.util.Scanner;
public class Lab09Task12 {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        int []a=new int [10];
        for (int i=0;i<a.length ;i++){
            System.out.println("Please enter a number");
            a[i]=sc.nextInt();
            
        }
        for (int k=a.length-1;k>=0;k--){
            if(a[k]%2==0){
                System.out.println(a[k]+" "+k);
                
            }
        }
    }
}