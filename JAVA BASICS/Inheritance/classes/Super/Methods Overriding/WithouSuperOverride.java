class A
{
	void show()
	{
		System.out.println("hi");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("bye");
	}
}
class WithouSuperOverride
{
	public static void main(String args[])
	{
		B ob=new B();
		ob.show();
		ob.show();
	}
}