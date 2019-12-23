interface A
{
	void f1();
}
interface B
{
	void f2();
}
interface D extends A,B
{
	void f3();
}
class C implements D
{
	public void f1()
	{
		System.out.println("f1() called");
	}
	public void f2()
	{
		System.out.println("f2() called");
	}
	public void f3()
	{
		System.out.println("f3() called");
	}
}
class MultipleInher
{
	public static void main(String args[])
	{
		A a=new C();
		a.f1();//A is super ref pointing subclass obj can call f1 as both super and sub contain f1
		B b=new C();
		b.f2();//B is super ref pointing subclass obj can call f1 as both super and sub contain f2
		D d=new C();
		d.f3();//D is super ref pointing subclass obj can call f1 as both super and sub contain f3
		C c=new C();
		c.f1();
		c.f2();
		c.f3();
	}
}