interface MyInter
{
	int num=100;
	int calc(int x,int y);
	void show();
}
class ImpInter implements MyInter
{
	public int calc(int x,int y) //Must be declared public as default access specifier for an interface is public
	{
		return (x+y);
	}
	public void show()//If not declared public or a stronger access specifier
	{				  //It goes from public->default access specifier and access specifier can remain same or get stronger but cannot get weaker on implementation
		System.out.println("show called");
	}
}
class AccessComImplInter
{
	public static void main(String args[])
	{
		ImpInter i=new ImpInter();
		System.out.println("sum="+i.calc(4,5));
		i.show();
	}
}
		