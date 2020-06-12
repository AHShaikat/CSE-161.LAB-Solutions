public class Lab10Task05{
  public static void main(String[] args){
    int a[]={7,13,2,10,6};
    for(int i=0; i<a.length; i++){
      int max=a[i];
      int loc=i;
      for(int j=1+i; j<a.length; j++){
        if(a[j]>max){
          max=a[j];
          loc=j;
        }
      }
        int temp=a[i];
        a[i]=a[loc];
        a[loc]=temp;
        System.out.print(max+",");
    }
  }
}
