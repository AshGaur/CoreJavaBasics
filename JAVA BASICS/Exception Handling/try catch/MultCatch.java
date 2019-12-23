class MultCatch
{
	public static void main(String args[])
	{
		int a=(int)(Math.random()*10);
		int arr[]={1,2,3,4,5};
		System.out.println("value of a is:"+a);
		try
		{
			int b=50/a;
			System.out.println("b="+b);
			System.out.println(arr[a]);
			System.out.println("In try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program Ends");
	}
}