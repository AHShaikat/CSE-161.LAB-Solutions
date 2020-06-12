import java.util.Scanner;

public class Task08{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String [] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    System.out.println("Please enter any number (between 0 and 9)");
    int num = sc.nextInt();
    
    System.out.println("You have entered : "+array[num]);
  }
}