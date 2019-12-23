class SuperClass
{
	void show()
	{
		System.out.println("show called");
	}
}
class SubClass extends SuperClass
{
	void showMe()
	{
		System.out.println("showMe() called");
	}
}
class SuperClassRef
{
	public static void main(String args[])
	{
		SuperClass s=new SubClass();
		s.show();
		// s.showMe(); s cannot call showMe() as it is not present in the superclass
	}
}