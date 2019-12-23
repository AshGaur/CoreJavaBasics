interface A
{
	void f1();
	void f2();
}
abstract class B implements A//All interface methods must be overidden in the class directly subclassing the interface
{
	public void f1()
	{
		System.out.println("f1() called");
	}
}
class C extends B 
{
	public void f2()//method f2 can be overridden here as class B is abstract and definitely requires to be extended 
	{
		System.out.println("f2() called");
	}
}
class AbstractInter
{
	public static void main(String args[])
	{
		// A a=new A();	A being abstract class cannot be instantiated
		// B b=new B();	B being abstract class cannot be instantiated
		C c=new C();
		c.f1();
		c.f2();
	}
}