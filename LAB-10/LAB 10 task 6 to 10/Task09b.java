import java.util.Scanner;

public class Task09b{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int [] array = new int [15];
    
    int count0=0;
    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;
    int count7=0;
    int count8=0;
    int count9=0;
    System.out.println("Please enter 15 numbers (each between 0 to 9)");
    for(int i=0; i<array.length; i++){
      array[i] = sc.nextInt();
      if(array[i]==0)
        count0++;
      if(array[i]==1)
        count1++;
      if(array[i]==2)
        count2++;
      if(array[i]==3)
        count3++;
      if(array[i]==4)
        count4++;
      if(array[i]==5)
        count5++;
      if(array[i]==6)
        count6++;
      if(array[i]==7)
        count7++;
      if(array[i]==8)
        count8++;
      if(array[i]==9)
        count9++;
    }
    System.out.println("Zero is available: " +count0+" times.");
    System.out.println("One is available: " +count1+" times.");
    System.out.println("Two is available: " +count2+" times.");
    System.out.println("Three is available: " +count3+" times.");
    System.out.println("Four is available: " +count4+" times.");
    System.out.println("Five is available: " +count5+" times.");
    System.out.println("Six is available: " +count6+" times.");
    System.out.println("Seven is available: " +count7+" times.");
    System.out.println("Eight is available: " +count8+" times.");
    System.out.println("Nine is available: " +count9+" times.");
  }
}