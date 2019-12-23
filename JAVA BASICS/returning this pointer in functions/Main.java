class Demo
{
	Demo()
	{
		System.out.println("cons called");
	}
	Demo show()
	{
		System.out.println("show called");
		return this;
	}
	Demo showMe()
	{
		System.out.println("showMe called");
		return this;
	}
	void call()
	{
		System.out.println("call called");
	}
}
class Main
{
	public static void main(String args[])
	{
		new Demo().show().showMe().call();
	}
}