//Bubble Sort
import java.util.Scanner;
class BubbleSort
{
	public static void bubSort(int a[])
	{
		int init=0,len=a.length;
		boolean flag=false;
		int j=0;
		while(true)
		{
			flag=true;
			for(int i=0;i<len-1;i++)
			{
				j=i+1;
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		bubSort(ar);
		System.out.print("Sorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}