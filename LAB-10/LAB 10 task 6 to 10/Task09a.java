import java.util.Scanner;

public class Task09a{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int [] array = new int [15];
    
    System.out.println("Please enter 15 numbers (each between 0 to 9");
    for(int i=0; i<array.length; i++){
      array[i] = sc.nextInt();
    }
    
    for(int i=0; i<=9; i++){                    // Counting
      int counter = 0;
      for(int j=0; j<array.length; j++){
        if(array[j] == i)
          counter++;
      }
      System.out.println(i + " is available: " +counter+" times.");
    }
  }
}