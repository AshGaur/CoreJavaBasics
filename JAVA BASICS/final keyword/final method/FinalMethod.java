class A
{
	final void authorName()
	{
		System.out.println("authorName() in class A");
	}
}
class FinalMethod extends A
{
	void authorName() //final method cannot be overridden
	{
		System.out.println("authorName() overridden");
	}
}