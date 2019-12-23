//**** Only Exceptions in Class Throwable can be thrown none other thann that------------------------------------------------
class DemoThrow
{
	public static void main(String args[])
	{
		//Only Throwable exceptions can be thrown
		ArithmeticException e=new ArithmeticException();
		throw(e);//Exception thrown without any reason because of Exception object being thrown
		//System.out.println("This is not reached");//Because of Exception being thrown this is not reached
	}
}