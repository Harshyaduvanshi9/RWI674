package java_pr;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {


		
			// TODO Auto-generated method stub
			System.out.println("Enter a Number");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int a=num;
			int r=0;
			int c;
			while(num>0)
			{
				c=num%10;
				r=r+c*c*c;
				num=num/10;
				
				
			}
			if(a==r)
				System.out.println("Number is Armstrong");
			else
				System.out.println("Number is not Armstrong");
				
			

		


		// TODO Auto-generated method stub

	}

}
