class Test
{
}
class ToStringNotOver
{
	public static void main(String args[])
	{
		Test a=new Test();
		System.out.println(a);
		System.out.println("lets print getclass():"+a.getClass());//prints class and classname
		System.out.println("lets print getclass():"+a.getClass().getName());//prints only classname not the keyword class
		System.out.println("lets print getclass():"+Integer.toHexString(a.hashCode()));//prints hashcode for the given class
	}
}

/* the function ToString is defined as
public String toString()
{
	return getClass().getName()+'@'+Integer.toHexString(hashCode());
}
*/