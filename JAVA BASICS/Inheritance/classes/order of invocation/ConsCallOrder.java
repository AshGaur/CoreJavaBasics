class A
{
	A()
	{
		System.out.println("A invoked");
	}
}
class B extends A
{
	B()
	{
		System.out.println("b invoked");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C invoked");
	}
}
class D extends C
{
	D()
	{
		System.out.println("D invoked");
	}
}
class ConsCallOrder//invocation A,B,C and D
{
	public static void main(String args[])
	{
		System.out.println("-------------------------------------");
		D b=new D();
		System.out.println("-------------------------------------");
	}
}