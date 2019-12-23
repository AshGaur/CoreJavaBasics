//When this program is executed the thread which is made to sleep pauses and resumes for entered time which is it can be seen as  printing pauses and resumes
class A extends Thread
{
	public void run()
	{
		System.out.println("Class A");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("i="+i);
				sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Class B");
		try
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("j="+j);
				sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("Class C");
		try
		{
			for(int k=0;k<5;k++)
			{
				System.out.println("k="+k);
				sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class SleepThread
{
	public static void main(String args[])
	{
		A oa=new A();
		B ob=new B();
		C oc=new C();
		oa.start();
		ob.start();
		oc.start();
		System.out.println("Demo of sleep()");
		try
		{
			for(int l=0;l<5;l++)
			{
				System.out.println("l="+l);
				Thread.sleep(1500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}