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
				System.out.println("ThreadName:"+getName());
				long del=(long)(Math.random()*1000);
				sleep(del);
				System.out.println("Delay is:"+del);
			}
		}
		catch(InterruptedException e)
		{ }
		System.out.println("Thread-"+getName()+" ending");
	}
}
public class JoinThread
{
	public static void main(String args[])
	{
		A thread1=new A("first");
		A thread2=new A("second");
		A thread3=new A("third");
		A thread4=new A("fourth");
		System.out.println("Thread1 isAlive:"+thread1.isAlive());
		System.out.println("Thread2 isAlive:"+thread2.isAlive());
		System.out.println("Thread3 isAlive:"+thread3.isAlive());
		System.out.println("Thread4 isAlive:"+thread4.isAlive());
		try
		{
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		}
		catch(InterruptedException e)
		{ }
		System.out.println("Thread1 isAlive:"+thread1.isAlive());
		System.out.println("Thread2 isAlive:"+thread2.isAlive());
		System.out.println("Thread3 isAlive:"+thread3.isAlive());
		System.out.println("Thread4 isAlive:"+thread4.isAlive());
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread:"+i);
		}
	}
}