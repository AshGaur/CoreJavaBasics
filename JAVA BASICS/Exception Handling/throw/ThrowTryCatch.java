class ThrowTryCatch
{
	public static void main(String args[])
	{
		try
		{
			ArithmeticException e=new ArithmeticException();
			throw(e);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Reached end of file");
	}
}