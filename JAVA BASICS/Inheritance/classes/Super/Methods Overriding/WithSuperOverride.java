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
		super.show();
	}
}
class WithSuperOverride
{
	public static void main(String args[])
	{
		new B().show();
	}
}