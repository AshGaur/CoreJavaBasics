class Encap
{
	public String toString()
	{
		return("Yupp you did override toString() method");
	}
}
class ToStringOverride
{
	public static void main(String args[])
	{
		Encap m=new Encap();
		System.out.println(m);//overridden method only gets called when an object is printed i.e. object calls toString())
	}
}