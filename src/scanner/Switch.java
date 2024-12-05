package scanner;
import java.util.Scanner;
public class Switch {
	public void add() {
		int a=10;
		int b=5;
		System.out.println(a+b);
		}
		public void Sub() 
		{
		int a=10;
		int b=5;
		System.out.println(a-b);
		}
		public void multi() 
		{
		int a=10;
		int b=5;
		System.out.println(a*b);
		}
		public void div() {
		int a=10;
		int b=5;
		System.out.println(a/b);}	

public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
        System.out.println("---Select---\na.Addition\nb.Substraction\nc.Multiplication\nd.Division\ne.Exit");
        String ch=sc.next();
        Switch c=new Switch();
        switch(ch)
        {
        case"a":
        	c.add();
        	break;
        case"b":
        	c.Sub();
        	break;
        case"c":
        	c.multi();
        	break;
        case"d":
        	c.div();
        	break;
        case"e":
        	System.out.println("End Calculation");
        	flag=false;
        	break;
        	default:
        		System.out.println("Invaild Input");
        		break;
        }
        
        }
	}

}
