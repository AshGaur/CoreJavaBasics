class MyException extends Exception
{
	MyException(String str)
	{
		super(str);//Exception(String) is the constructor that takes a message for USER DEFINED EXCEPTION
	}
}

class UserDefExcep
{
	public static void main(String args[])
	{
		int a=(int)(Math.random()*5);
		System.out.println("Value of a:"+a);
		if(a<5)
		{
			try
			{
				MyException m=new MyException("No is <5");
				throw(m);//becomes throwable as object of Exception class because Exception(String) called in MyException() 
			}
			catch(MyException obj)
			{
				System.out.println(obj);//obj receives Exception String as parameter i.e. "No is <5"
				System.out.println("Catch block");
			}
		}
		else
		{
			System.out.println("We are in else block, no is:"+a);
		}
	}
}