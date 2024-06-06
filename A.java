package java_pr;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcd xyz man 123 manas java pen python QA";
		String arr[]=a.split(" ");

		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i].length()==3)
			{
			System.out.println(arr[i]);
			}
		

		}
		
		
	}

}
