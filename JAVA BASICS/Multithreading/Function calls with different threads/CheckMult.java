class CheckMult extends Thread
{
	CheckMult(String name)
	{
		super(name);
		start();
	}
	public void run()
	{
		try
		{
			void getValues(int n)
			{
				for(i=0;i<n;i++)
				{
					System.out.println(getName()+i);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(getName()+" ending");
		}
	}
}
class MainCheck
{
	public static void main()
	{
		new CheckMult("first").getValues(1000);
		new CheckMult("Second").getValues(1000);
		new CheckMult("Third").getValues(1000);
	}
}