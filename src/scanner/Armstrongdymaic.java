package scanner;
import java.util.Scanner;
public class Armstrongdymaic {
		public static int countDigits(int num) {
		int ct = 0;
		while (num != 0) {
		    num /= 10;
		    ct++;
		}
		return ct;
			}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number : ");
int num=sc.nextInt();
int aa=num;
Armstrongdymaic a=new Armstrongdymaic();
int ct=a.countDigits(num);
int out=0;
while(num>0) {
	int temp=num%10;
	int p=1;
	for(int i=1;i<=ct;i++) {
		p=p*temp;}
	out=out+p;//orride method
	num=num/10;}
if(out==aa) {
	System.out.println(out+"  Armstrong number...");
}
else {
	System.out.println(out+"   Non Armstrong number....");
}
}


}
