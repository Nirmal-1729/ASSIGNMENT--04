import java.util.Scanner;
class loop{
    public static void main (String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("enter the Number");
      int n= input.nextInt();
     
      int i=1;
      while(i<=n){
        if (i%5==0)
        System.out.print("\tHello\t" );

        else
        System.out.print("\t"+i+"\t");
        i++;
      }

        
    }
}