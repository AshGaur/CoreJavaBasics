class ToString
{
	public static void main(String args[])
	{
		int a=5,b=3;
		System.out.println("Here is it:"+a+b); //reads a and b as string due to inherited toString() method
		System.out.println("Here is it:"+(a+b));//reads a+b as string 
		System.out.println(a+b+"Here it is");//So, conclusioin is that the tostring method is applied when it detects a string but before string occurs it keeps adding a and b and then makes them string
	}
}