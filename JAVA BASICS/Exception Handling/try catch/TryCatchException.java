//Arithmetic Exception
class TryCatchException
{
	public static void main(String args[])
	{
		int a=(int)(Math.random()*5);
		System.out.println("a="+a);
		try
		{
			int b=50/a;
			System.out.println("b="+b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("we are in catch block:"+e.toString());//Pointless to use toString() method
			System.out.println(e);//No need of toString() method as it is implicitly called when an object is printed
		}
	}
}