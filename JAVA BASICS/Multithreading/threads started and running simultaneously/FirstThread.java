class A extends Thread
{
	public void run()//All run methods invoked and run at the same time and therefore lead to printing different values
	{
		System.out.println("Class A");
		for(int i=0;i<5;i++)
		{
			System.out.println("Value of i is:"+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Class B");
		for(int j=0;j<5;j++)
		{
			System.out.println("Value of j is:"+j);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("Class C");
		for(int k=0;k<5;k++)
		{
			System.out.println("Value of k is:"+k);
		}
	}
}
class FirstThread
{
	public static void main(String args[])
	{
		A oa=new A();
		B ob=new B();
		C oc=new C();
		oa.start();//thread1
		ob.start();//thread2
		oc.start();//thread3
	}
}