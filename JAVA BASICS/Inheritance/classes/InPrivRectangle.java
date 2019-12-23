class figure
{
	private int l,b,area;// being private cannot be inherited
	void showarea()
	{
		System.out.println(area);
	}
}
class InPrivRectangle extends figure
{
	InPrivRectangle(int len,int wid)
	{
		l=len;//l is private member of superclass and cannot be inherited
		b=wid;//b is private member of superclass and cannot be inherited
		area=l*b;//area is private member of superclass and cannot be inherited
	}
}
