//Selection Sort
import java.util.Scanner;
class SelectionSort
{
	public static void selsort(int a[])
	{
		int start=0,end=a.length,i;
		int pos=0;
		while(start!=end)		//O(n^2)
		{
			int min=a[start];
			for(i=start;i<end;i++)
			{
				if(min>a[i])
				{
					min=a[i];
					pos=i;
				}
			}
			if(min!=a[start])
			{
				int temp;
				temp=a[start];
				a[start]=a[pos];
				a[pos]=temp;
			}
			start++;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		selsort(ar); //All references being passed therefore the function works in the initial array itself not on a copy
		System.out.print("Sorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}