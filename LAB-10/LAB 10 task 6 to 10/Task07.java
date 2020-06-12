import java.util.Scanner;

public class Task07{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int [] array = new int [10];
    
    System.out.println("Please enter your number(s)");  // Input
    for(int i=0; i<array.length; i++){
      array[i] = sc.nextInt();
    }
    
    for(int i=0; i<array.length; i++){                  // Sort
      for(int j=i+1; j<array.length; j++){
        if(array[i] > array[j]){
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    
//    for(int i=0; i<array.length; i++){               // Printing to verify sort
//      System.out.print(array[i]+" ");
//    }
    
    for(int i=0; i<array.length; i+=2){                // Print all numbers in odd position of array
      System.out.print(array[i]+" ");
    }
    for(int i=1; i<array.length; i+=2){                // Print all numbers in even position of array
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}