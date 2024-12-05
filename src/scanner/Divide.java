package scanner;
import java.util.Scanner;
public class Divide {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no to check");
    int num=sc.nextInt();
    for(int div=1;div<num;div++){
    	if(num%div==0){
     	System.out.println(num+"--is divisble by--"+div);}
    }}}


