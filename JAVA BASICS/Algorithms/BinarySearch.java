import java.util.Scanner;
class BinarySearch
{
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
		System.out.println("Enter element to find");
		int find=sc.nextInt();
		int start=0,end=9;
		int mid=(start+end)/2;
		while(end!=start)
		{
			if(find<ar[mid])
			{
				end=mid;
				mid=(start+end)/2;
			}
			else if(find>ar[mid])
			{
				start=mid;
				mid=(start+end)/2;
			}
			else
			{
				System.out.println("Element found at position "+(mid+1));
				break;
			}
		}
	}
}