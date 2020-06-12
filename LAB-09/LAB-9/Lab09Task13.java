import java.util.Scanner;
public class Lab09Task13 {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        int []a=new int [10];
        int evensum=0;
        int oddsum=0;
        int divsum=0 ;
        for (int i=0;i<a.length ;i++){
            System.out.println("Please enter a number");
            a[i]=sc.nextInt();
            
        }
        for (int k=0;k<a.length;k++){
            if(a[k]%2==0){
            evensum+=a[k];
                
            }
            else{
              oddsum+=a[k];
            }
            if (a[k]%5==0){
              divsum+=a[k];
            }
        }
        System.out.println (evensum);
        System.out.println (oddsum);
        System.out.println (divsum);
    }
}