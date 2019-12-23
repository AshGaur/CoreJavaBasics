class figure
{
	int l,b,area;
	void showarea()
	{
		area=l*b;
		System.out.println("area="+area);
	}
}
class rectangle extends figure
{
	rectangle(int len,int bre)
	{
		l=len;
		b=bre;
	}
}
class square extends figure
{
	square(int len)
	{
		l=len;
		b=len;
	}
}
class inheritance
{
	public static void main(String args[])
	{
		rectangle r=new rectangle(4,5);
		r.showarea();
		square s=new square(4);
		s.showarea();
	}
}