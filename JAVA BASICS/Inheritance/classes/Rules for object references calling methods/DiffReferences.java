//super class reference when linked to subclass object
//can only call a method present in both super and subclass
//not the method present only in subclass doesnt matter if the object is of the subclass containing that method
//reference is when superclassname ob then ob is reference
//when ob=new subclassname() then it cannot call a method which superclass doesnt have but subclass has
class A
{
	public void X()
	{
		System.out.println("Class A: method X()");
	}
	public void Y()
	{
		System.out.println("Class A: method Y()");
	}
}
class B extends A
{
	public void Y()
	{
		System.out.println("Class B: method Y()");
	}
}
class C extends B
{
	public void X()
	{
		System.out.println("Class C: method X()");
	}
	public void Z()
	{
		System.out.println("Class C: method Z()");
	}
}
class DiffReferences
{
	public static void main(String args[])
	{
		A objA;
		objA=new A();
		objA.X();
		objA.Y();
		System.out.println("--------------------------------------");
		
		objA=new B();
		objA.X();
		objA.Y();
		System.out.println("--------------------------------------");
		
		objA=new C();
		objA.X();
		objA.Y();
		//objA.Z();	Z() is in C but not in A which is a super class therefore error
		System.out.println("--------------------------------------");
		
		B objB;
		objB=new B();
		objB.X();
		objB.Y();
		System.out.println("--------------------------------------");
		
		objB=new C();
		objB.X();
		objB.Y();
		//objB.Z();	Z() is in C but not in B and B is a super class therefore error
		System.out.println("--------------------------------------");
		
		C objC;
		objC=new C();
		objC.Z();
		System.out.println("--------------------------------------");
	}
}