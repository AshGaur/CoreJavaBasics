//head variable 
//new value entered at head or first position
import java.util.Scanner;
class node
{
	node next;
	int data;
}
class LinkedList
{
	static node head;
	public static void insert(int x)
	{
		node temp=new node();
		temp.data=x;
		temp.next=head;
		head=temp;
		System.out.println(x+" entered");
		System.out.print("Linked list formed: ");
		node temp1=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		head=null;
		int n=5;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			insert(x);
		}
	}
}