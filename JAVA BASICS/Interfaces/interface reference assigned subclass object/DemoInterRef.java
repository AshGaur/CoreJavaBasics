//interface cannot be instantiated but its reference can be assigned subclass's object
interface MyInter
{
	void show();
	void showMe();
}
class UseInter implements MyInter
{
	public void show()
	{
		System.out.println("show called");
	}
	public void showMe()
	{
		System.out.println("showMe called");
	}
	void call()
	{
		System.out.println("Call called");
	}
}
class DemoInterRef
{
	public static void main(String args[])
	{
		MyInter obj;//interface reference obj
		obj=new UseInter();//obj assigned subclass object
		obj.show();
		obj.showMe();
		// obj.call();	obj is interface's reference which is super to the class's object being assigned 
	}			//	and superclass doesnt has  the function call and therefore cannot be called
}