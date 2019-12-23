class figure
{
	int l,b,area;
	void show()
	{
		area=l*b;
		System.out.println("l="+l+" b="+b);
		System.out.println("area="+area);
	}
}
class rectangle extends figure
{
	rectangle(int len,int wid)
	{
		l=len;
		b=wid;
	}
}
class square extends rectangle
{
	square()
	{
		super(4,5);
		System.out.println("square called");
	}
}
class SuperFunc
{
	public static void main(String args[])
	{
		square s=new square();
		s.show();
	}
}