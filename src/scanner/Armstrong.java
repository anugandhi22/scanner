package scanner;
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Number : ");
   int num=sc.nextInt();
   int temp=num;
   int arm=0;
   while(temp>0) 
   {
	   int rem=temp%10;
	   arm=arm+(rem*rem*rem);
	   temp=temp/10;
   }
   if(arm==num) 
   {
	   System.out.println(num+"  is Armstrong.");
	  
   }
   else
   {
	   System.out.println(num+"  is not Armstrong");
	  
   }
}
}
