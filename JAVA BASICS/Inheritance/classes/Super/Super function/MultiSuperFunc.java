class A
{
	private int a,b;
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void sum()
	{
		System.out.println(a+b);
	}
}
class B extends A
{
	int c;
	B(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}
	void showB()
	{
		System.out.println("c is :-"+c);
	}
}
class C extends B
{
	private int d;
	C(int a,int b,int c,int d)
	{
		super(a,b,c);
		this.d=d;
	}
	void showC()
	{
		System.out.println("d is :"+d);
	}
}
class MultiSuperFunc
{
	public static void main(String args[])
	{
		C oc=new C(10,20,30,40);
		oc.showC();
		oc.showB();
		oc.sum();
	}
}