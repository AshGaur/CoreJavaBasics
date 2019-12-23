class CheckPrime extends Thread
{
	int p;
	CheckPrime(int n)
	{
		super("CheckPrime");
		start();
		p=n;
	}
	public void start()
	{
		int flag=0;
		try
		{
			for(int i=2;i<p/2;i++)
			{
				System.out.println("Thread Name:"+getName());
				if(p%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("Number found to be composite");
			}
			else
			{
				System.out.println("Number is prime");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
class CompRandom extends Thread
{
	int n;
	CompRandom(int n)
	{
		super("Random Array");
		start();
		this.n=n;
	}
	public void run()
	{
		System.out.println("isAlive():"+isAlive());
		int p=(int)(Math.random()*n);
		int arr[]=new int[p];
		try
		{
			for(int i=0;i<p;i++)
			{
				arr[i]=(int)(Math.random()*n);
				System.out.println("Thread Name:"+getName());
				System.out.println("activeCount:"+activeCount());
			}
		}
		catch(Exception e)
		{
		}
		for(int i=0;i<p;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
class MyOwnMultThread
{
	public static void main(String args[])
	{
		CheckPrime oa=new CheckPrime(325);
		CompRandom ob=new CompRandom(20);
	}
}