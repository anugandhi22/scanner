package scanner;

import java.util.Scanner;

public class Oddser {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number :---");
	    int num=sc.nextInt();
	    
	    for(int div=2;div<num;div++)
	    {
	    	if(num%div==0)
	    	{
	    	System.out.println();
	    	}
	    	else {
	    		System.out.println();
	    	}
	    }
	}

}
