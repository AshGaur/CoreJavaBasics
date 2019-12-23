//tail linked list
import java.util.Scanner;
class Node
{
	Node next;
	int data;
}
class TailLinkedList
{
	static Node head,tail;
	public static void insert(int x)
	{
		Node temp=new Node();
		temp.data=x;
		if(head==null)
		{
			head=temp;
			tail=temp;
		}
		tail.next=temp;
		temp.next=null;
		tail=temp;
		
		System.out.println(x+" entered");
		System.out.print("Linked list formed: ");
		Node temp1=head;
		while(temp1!=null)
		{
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
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