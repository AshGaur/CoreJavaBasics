//second catch statement catching the same exception is not reached if the first catch statement does the job
class SuperSubCatch
{	
	public static void main(String args[])
	{
		try
		{
			int a=0;
			int b=42/a;
		}
		catch(Exception e)//Exception is the super class for Arithmetic Exception and therefore already handled exception
		{
			System.out.println("Generic Exception catch");
		}
		catch(ArithmeticException e)//Never called as this is just a sub class while the above catch statement already caught the exception
		{
			System.out.println("This is never reached");
		}
	}
}