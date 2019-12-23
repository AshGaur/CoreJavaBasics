class Main
{
	public static void main(String args[])
	{
		StaticCheck.DisplayA(2);// Runs perfectly as DisplayA is a static method
		StaticCheck.Check();//Gives error as check() is a non static method
		StaticCheck r=new StaticCheck();
		r.Check();
	}
}