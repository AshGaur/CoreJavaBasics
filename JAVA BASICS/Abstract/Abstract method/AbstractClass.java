abstract class Super
{
	abstract void show();
}
class AbstractClass extends Super
{
	void show()
	{
		System.out.println("abstract class extended and abstract method overridden");
	}
}
