//order of initialization
//1. Static block of super,
//2. Static block of sub
//3. Constructor of super
//4. Constructor of sub
class SuperClass
{
	int i=0;
	static
	{
		System.out.println("SuperClass static block");
	}
	SuperClass()
	{
		i=10;
		System.out.println("SuperClass instance variable:"+i);
	}
}
class SubClass extends SuperClass
{
	int j;
	static
	{
		System.out.println("SubClass static block");
	}
	SubClass()
	{
		j=15;
		System.out.println("SubClass instance variable:"+j);
	}
	public static void main(String args[])
	{
		new SubClass();
	}
}