class ReThrow
{	
	ArithmeticException e=new ArithmeticException();
	void show()
	{
		try
		{
			throw(e);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Exception caught");
			throw(e1);
		}
	}
}
class MainThrow
{
	public static void main(String args[])
	{
		ReThrow d=new ReThrow();
		try
		{
			d.show();
		}
		catch(Exception e2)
		{
			System.out.println("Recaught Exception");
		}
	}
}