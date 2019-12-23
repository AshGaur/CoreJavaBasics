final class A
{
	A()
	{
		System.out.println("Instantiation of a final class successful");
	}
}
class CheckInstantiationFinalClass
{
	public static void main(String args[])
	{
		A obj=new A();
	}
}