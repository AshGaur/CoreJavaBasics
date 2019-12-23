class A
{
	int a=50;
}
class B extends A
{
	int a=100;
	void show()
	{
		System.out.println(a);
		System.out.println(a);
	}
}
class WithoutSuper
{
	public static void main(String args[])
	{
		new B().show();
	}
}