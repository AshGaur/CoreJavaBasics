import java.util.Scanner;
class TreeNode
{
	TreeNode left,right;
	int data;
}
class TreeForm
{
	static TreeNode root;
	public static void insert(int x)
	{
		TreeNode temp=new TreeNode();
		if(root==null)
		{
			root=temp;
		}
		temp.data=x;
		TreeNode temp1=root,lstinstance=null;
		int flag=0;
		while(temp1!=null)
		{
			flag=0;
			if(x<temp1.data)
			{
				lstinstance=temp1;
				temp1=temp1.left;
				flag=1;
			}
			else if(x>temp1.data)
			{
				lstinstance=temp1;
				temp1=temp1.right;
				flag=2;
			}
			else
			{
				break;
			}
		}
		if(flag==1)
		{
			lstinstance.left=temp;
		}
		else if(flag==2)
		{
			lstinstance.right=temp;
		}
	}
	public static void display()
	{
		Scanner sc=new Scanner(System.in);
		TreeNode temp=root;
		System.out.println("Root Tree element="+temp.data);
		while(true)
		{
			System.out.println("Enter direction");
			String input=sc.nextLine();
			char c=input.charAt(0);
			if(c=='l')
			{
				temp=temp.left;
			}
			else if(c=='r')
			{
				temp=temp.right;
			}
			if(temp!=null)
			{
			System.out.println("Tree element="+temp.data);
			}
			else
			{
				System.out.println("Reached End");
				break;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of tree elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter postion "+(i+1)+" element");
			int x=sc.nextInt();
			insert(x);
		}
		display();
	}
}