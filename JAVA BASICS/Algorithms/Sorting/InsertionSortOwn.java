//Insertion Sort
//Diff bw Insertion and selection
//selection: keep findng min and place at start index(which keeps on shifting)
//Insertion: make two parts sorted and unsorted
import java.util.Scanner;
class InsertionSortOwn
{
	public static void insSort(int a[])
	{
		int i,beg=0;
		int ssort=0,sunsort=1,esort=0;//startunsort	startsort
		int start=0;
		while(esort<a.length-1)
		{
			for(i=0;i<sunsort;i++)
			{
				beg=i;//keeps updating i values if the if condition doesnt come and break doesnt occur
				if(a[i]>a[sunsort])
				{
					beg=i;//position where new element should be entered as larger element than given is found
					break;
				}
			}
			int temp=a[sunsort];
			for(i=esort;i>=beg;i--)	//loop to shift required elements to the right
			{
				a[i+1]=a[i];
			}
			a[beg]=temp;
			esort++;//increase end index of sorted elements
			ssort=0; //start of sorted elements back to zero
			sunsort++; //start of unsorted array increased by one as one element from
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
		insSort(ar);
		System.out.print("Sorted array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
