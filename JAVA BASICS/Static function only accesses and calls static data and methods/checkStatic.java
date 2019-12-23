class checkStatic
{
	int a;
	checkStatic()
	{
		System.out.println("constructor called");
	}
	/*constructor cannot be made static*/ checkStatic(int p)
	{
		this();//can only be written in a constructor
	}
}
	
