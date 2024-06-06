package java_pr;

import java.util.Scanner;

public class LinearSearch {
	public static int ls(int arr[],int s,int k) {
		for(int i=0;i<s;i++)
		{
			if(arr[i]==k)
				return i+1;
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int s=sc.nextInt();
		
		int arr[]=new int[s];
		System.out.println("Enter Elements of array  ");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter What no. u want to Search : ");
		int k=sc.nextInt();
		int result=ls(arr,s,k);
		if(result==-1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found at"+result);
		}
		
		

	}

}
