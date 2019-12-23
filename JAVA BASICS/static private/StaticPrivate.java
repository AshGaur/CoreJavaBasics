class StaticPrivate
{
	/*private  cannot be accessed even if static */ static int a;
	StaticPrivate(int p)
	{
		a=p;
	}
}
