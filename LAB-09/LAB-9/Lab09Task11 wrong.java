import java.util.Scanner;
public class Lab09Task11 {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        int []a=new int [10];
        for (int i=0;i<a.length ;i++){
            System.out.println("Please enter a number");
            a[i]=sc.nextInt();
        
        System.out.println("Please enter a number");
        int x=sc.nextInt();
        if(x==a[i]){
          System.out.println("Please enter different number");
        } 
    }
}
}
    
