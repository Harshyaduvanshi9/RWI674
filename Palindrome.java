package java_pr;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int dnum=num;
		int r=0;
		int c;
		while(num>0)
		{
			c=num%10;
			r=r*10+c;
			num=num/10;
			
			
		}
		System.out.println("No. is "+ r);
		if(r==dnum)
		{
			System.out.println("No. is palindrome");
		}
		else
		{
			System.out.println("No. is not palindrome");
			
		}
		

	}

}
