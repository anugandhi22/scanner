package scanner;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :---");
    int num=sc.nextInt();
    int ch=0;
    for(int div=2;div<num;div++)
    {
    	if(num%div==0)
    	{
    		ch++;
    	}
    }
    System.out.println(num+" is divisble by-- "+ch+" nos ");
    if(ch>0) {
    	System.out.println(num+"  is not prime number");
    }
    else
    	System.out.println(num+" is prime num");
    }
}
