class Animal
{
}
class Mammal extends Animal
{
}
class DogInstanceOf extends Mammal
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		Mammal m=new Mammal();
		DogInstanceOf d=new DogInstanceOf();
		System.out.println(a instanceof Mammal);
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);
		System.out.println(a instanceof DogInstanceOf);
	}
}