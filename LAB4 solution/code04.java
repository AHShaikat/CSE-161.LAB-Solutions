public class code04{
  public static void main(String[] args){
    int i=18;
    while(i<=63){
      if(i%2==0){
        System.out.print(i+",");
      }
      else{
        System.out.print(i*-1+",");
      }
      i+=9;
    }
  }
}