class A1Class
{
	int a,b;
	A1Class()
	{
	}
	A1Class(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void show(A1Class l)
	{
		System.out.println("Value of reference object variables");
		System.out.println(l.a+":"+l.b);
	}
	boolean compare(A1Class m)
	{
		if((m.a==a)&&(m.b==b))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}