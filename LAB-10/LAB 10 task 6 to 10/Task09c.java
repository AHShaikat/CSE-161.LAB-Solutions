import java.util.Scanner;

public class Task09c{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int [] array = new int [15];
    int [] counter = new int [10];
    
    System.out.println("Please enter 15 numbers (each between 0 to 9)");
    for(int i=0; i<array.length; i++){
      array[i] = sc.nextInt();
      counter[array[i]] ++;
    }
    System.out.println("Zero is available: " +counter[0]+" times.");
    System.out.println("One is available: " +counter[1]+" times.");
    System.out.println("Two is available: " +counter[2]+" times.");
    System.out.println("Three is available: " +counter[3]+" times.");
    System.out.println("Four is available: " +counter[4]+" times.");
    System.out.println("Five is available: " +counter[5]+" times.");
    System.out.println("Six is available: " +counter[6]+" times.");
    System.out.println("Seven is available: " +counter[7]+" times.");
    System.out.println("Eight is available: " +counter[8]+" times.");
    System.out.println("Nine is available: " +counter[9]+" times.");
  }
}