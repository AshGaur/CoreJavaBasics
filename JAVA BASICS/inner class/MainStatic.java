class Outer
{
	int out=50;
	static class StaticInner
	{
		int in=10;
		void show()
		{
			//System.out.println("accessing out through inner="+out);
			//out is outer class non static member which cannot be accessed by inner static class
			System.out.println("static inner class show called");
		}
	}
}
class MainStatic
{
	public static void main(String args[])
	{
		Outer.StaticInner obj=new Outer.StaticInner();//static class constructor can only be called by class name
		//ob.show(); error outer members or non static members cannot be called from a static inner class
		obj.show();
	}
}