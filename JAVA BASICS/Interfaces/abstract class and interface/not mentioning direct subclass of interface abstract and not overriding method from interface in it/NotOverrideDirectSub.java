interface A
{
	int a=10;
	void show();
}
class B implements A
{
}
class C extends B //B is not abstract  so its not allowed to override the method f2 here it should be 
{				  //overridden in class B
	public void show()
	{
		System.out.println("Show() called");
	}
}
class NotOverrideDirectSub
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.show();
	}
}