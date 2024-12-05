package scanner;
import java.util.*;
public class Test {
public static void main(String[] args) 
{
		Scanner sc= new Scanner(System.in);
		Switch c=new Switch();
		System.out.println("-select-\n"+"1.Addition\n"+"2.Subtraction\n"+"3.Multiply\n"+"4.Exit");
		while(true)
		{
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			if(ch==1)
			{
				c.add();
			}
			else if (ch==2)
			{
				c.Sub();
			}
			else if (ch==3)
			{
				c.multi();
			}
			else if (ch==4)
			{
				break;
			}
			else
			{
				System.out.println("Error");
			}
		}
	}
}
