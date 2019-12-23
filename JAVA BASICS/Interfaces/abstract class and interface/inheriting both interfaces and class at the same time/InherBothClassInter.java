interface A
{
	void f1();
}
interface B
{
	void f2();
}
class C
{
	void show()
	{
		System.out.println("show called");
	}
}
class InherBothClassInter extends C implements A,B
{
	public void f1()
	{
		System.out.println("f1() called");
	}
	public void f2()
	{
		System.out.println("f2() called");
	}
}
