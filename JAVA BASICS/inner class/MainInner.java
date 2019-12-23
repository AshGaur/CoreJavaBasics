class Outer
{
	int out=50;
	class Inner
	{
		int in=5;
		void show()
		{
		System.out.println("out accesed through inner class="+out);
		}
	}
}
class MainInner
{
	public static void main(String args[])
	{
		Outer ob=new Outer();
		Outer.Inner obj=ob.new Inner();//constructor of inner class can be accessed by outer class object as it is non static
		obj.show();
	}
}