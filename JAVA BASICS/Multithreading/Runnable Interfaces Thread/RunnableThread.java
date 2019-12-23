//Runnable interface implementing class's object passed through Constructor of Thread as parameter-->Thread(Runnable Target object)
class A implements Runnable
{
	Thread t;
	A()
	{
		t=new Thread(this);//this pointer is the reference to this class itself which is runnable target object for thread
		t.start();
	}
	public void run()
	{
		System.out.println("Class A");
		for(int i=0;i<5;i++)
		{	
			System.out.println("i="+i);
			System.out.println("Active Count from A="+t.activeCount());
		}
	}
}
class B implements Runnable
{
	Thread t;
	B()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println("Class B");
		for(int j=0;j<5;j++)
		{
			System.out.println("j="+j);
			System.out.println("Active Count from B="+t.activeCount());
		}
	}
}
class C implements Runnable
{
	Thread t;
	C()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println("Class C");
		for(int k=0;k<5;k++)
		{
			System.out.println("k="+k);
			System.out.println("Active Count from C="+t.activeCount());
		}
	}
}
class RunnableThread
{
	public static void main(String args[])
	{
		A oa=new A();
		B ob=new B();
		C oc=new C();
	}
}