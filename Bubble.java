package java_pr;

public class Bubble {  
    static void print (int a[]) //function to print array elements  
{  
    int n = a.length;  
    int i;  
System.out.println("*********************");
    for (i = 0; i < n; i++)  
    {  
        System.out.print(a[i] + " ");  
    }         
System.out.println("*********************");
}  
static void bubbleSort (int a[])    // function to implement bubble sort  
{  
    int n = a.length;  
    int i, j, temp;  
    for (i = 0; i < n; i++)  
    {  
	//System.out.println("Iteration number i-->"+i+"j-->"+j);
	//print(a);
	
        for (j = i + 1; j < n; j++)  
        {  
	System.out.println("\nIteration number i-->"+i+"j-->"+j);
	System.out.println("a[i]--->"+a[i]+"a[j]--->"+a[j]);
            if (a[j] < a[i])  
            {  
		print(a);
                temp = a[i];  
		//print(a);
                a[i] = a[j];
		//print(a);  
                a[j] = temp; 
		
		print(a); 
            }  
        }  
    }  
}  
public static void main(String[] args) {    
int a[] = {35, 10, 31,11,20,9,5,33};    
Bubble b1 = new Bubble();  
System.out.println("Before sorting array elements are - ");    
b1.print(a);  
b1.bubbleSort(a);  
System.out.println();  
System.out.println("After sorting array elements are - ");    
b1.print(a);  
    
}    
}
