package scanner;
import java.util.Scanner;
public class Prime1 {
	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a Number : ");
      int num=sc.nextInt();
      boolean flag=false;
      for(int div=2;div<num;div++) {
    	  if(num%div==0) {
    		  flag=true;
    		  break;
    	  }
      }
     if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");  
	}
}
