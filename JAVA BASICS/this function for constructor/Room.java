class Room
{
	int l,b;
	Room()
	{
		l=4;
		b=5;
		System.out.println("Room() called");
	}
	Room(int a,int b)
	{
		this(1,2,3);//calls constructor with three parameters
		System.out.println("Room(a,b) called");
	}
	Room(int a,int b,int c)
	{
		this();//calls default constructor
		System.out.println("Room(a,b,c) called");
	}
	Room(int a)
	{
		b=a;
		System.out.println("Room(a) called");
	}
	void show()
	{
		System.out.println("l="+l+" b="+b);
	}
}