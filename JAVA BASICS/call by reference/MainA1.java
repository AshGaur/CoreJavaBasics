class MainA1
{
	public static void main(String args[])
	{
		A1Class obj=new A1Class(10,20);
		A1Class obj1=new A1Class();
		A1Class obj2=new A1Class(30,40);
		A1Class obj3=new A1Class(30,40);
		//In this program values displayed depend on the reference of object sent through parameter in show() method
		//If values are initialised with object reference being sent then only values are shown otherwise 0
		obj.show(obj);
		obj.show(obj1);
		obj.show(obj2);
		obj1.show(obj);
		obj1.show(obj1);
		obj1.show(obj2);
		obj2.show(obj);
		obj2.show(obj1);
		obj2.show(obj2);
		//comparing both values of instance variables in both the objects
		System.out.println("obj=obj1 is "+obj.compare(obj1));
		System.out.println("obj=obj1 is "+obj1.compare(obj2));
		System.out.println("obj=obj1 is "+obj2.compare(obj3));
	}
}
		