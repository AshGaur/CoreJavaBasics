//object value changing program as required
class Main
{
	public static void main(String args[])
	{
		Returnobj obj1=new Returnobj(2);
		Returnobj obj2=obj1.IncrByTen();
		System.out.println("obj1.a="+obj1.a);
		System.out.println("obj2.a="+obj2.a);
		obj2=obj2.IncrByTen();//further incremented
		System.out.println("value after further increment="+obj2.a);
	}
}