class Returnobj
{
	int a;
	Returnobj(int i)
	{
		a=i;
	}
	Returnobj IncrByTen()
	{
		Returnobj obj=new Returnobj(a+10);
		return obj;
	}
}