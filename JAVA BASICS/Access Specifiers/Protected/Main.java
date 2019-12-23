import p1.Class1;
class Main extends Class1
{
	public static void main(String args[])
	{
		new Main().show();
		System.out.println(new Main().a);//protected member accessed
		//Protected members can only be accessed by the class that directly inherits the class containting protected member
	}
}
