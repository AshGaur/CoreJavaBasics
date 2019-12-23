class FinalVariable
{
	final int num=100;
	FinalVariable()
	{
		num=120;//num cannot be assigned a value as it is a final variable
		System.out.println(num);
	}
}