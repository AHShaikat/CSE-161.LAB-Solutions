import java.util.Scanner;

public class Task06{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many numbers to input?");   // Length of array
    int num = sc.nextInt();
    int [] array = new int [num];
    
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
    
    int median = 0;
    if(num%2==0){                                      // Even number of input
      int medianLocation_1 = num/2;
      int medianLocation_2 = medianLocation_1 - 1;
      median = (array[medianLocation_1] + array[medianLocation_2]) / 2;
    }
    else{                                              // Odd number of input
      int medianLocation = num/2;
      median = array[medianLocation];
    }
    
    System.out.println("Median : "+ median);
  }
}