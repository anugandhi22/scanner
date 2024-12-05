package scanner;
import java.util.Scanner;
public class Fib 
{
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number :");
    int len=sc.nextInt();
    int a=0,b=1;
    System.out.print(a+" "+b+" ");
    for(int i=0;i<len-2;i++)
    {
    	int c=a+b;
    	System.out.print(c+" ");
    	a=b;
    	b=c;
    	break;
    }
    } 

}
