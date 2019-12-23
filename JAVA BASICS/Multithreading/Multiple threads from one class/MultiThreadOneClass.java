class A extends Thread
{
	A(String name)
	{
		super(name);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("i="+i);
				sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(getName()+" ending");
		}
	}
}
class MultiThreadOneClass
{
	public static void main(String args[])
	{
		new A("first");
		new A("second");
		new A("third");
		new A("fourth");
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println((Thread.currentThread()).getName()+" thread here********");
			}
		}
		catch(Exception e)
		{
		}
	}
}