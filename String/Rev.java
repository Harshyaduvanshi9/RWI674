package java_pr;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

	}
		for(int i=size-1;i>=0;i--)
		{
			System.out.println("reverse array"+arr[i]);
		}
		

}
