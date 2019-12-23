class InitStatBlock
{
	InitStatBlock() //third called constructor
	{
		System.out.println("Constructor called");
	}
	{//second called Initialization block runs before constructor
	System.out.println("Initialization Block");
	}
	static //first called static initialization block
	{
	System.out.println("Static block called");
	}
}