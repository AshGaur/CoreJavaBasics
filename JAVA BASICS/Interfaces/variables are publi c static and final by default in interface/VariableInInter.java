interface A
{
	int no=0;
	int yes=1;
	int maybe=2;
	// int later;		by default final so must be initialised
}
class VariableInInter implements A
{
	void show()
	{
		//no=10;	cannot assign value to a final variable
	}
}