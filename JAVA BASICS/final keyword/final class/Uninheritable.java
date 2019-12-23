final class Grade
{
	Grade()
	{
		System.out.println("Constructor of Grade Class called");
	}
}
class Uninheritable extends Grade //final class cannot be inherited
{
	public static void main(String args[])
	{
		Grade g=new Grade();//Grade can be instantiated but cannot be inherited
	}
}