class ThisDemo
{
	int a,b;
	ThisDemo(int a,int b)
	{
		//a=a;
		//b=b;  both commented statements dont lead to any change in the instance variables and hence default value zero remains in them resulting in product=0
		this.a=a;//this pointer points to the instance variable and thererfore changes their values to incoming values and hence product=8
		this.b=b;
	}
	void Display()
	{
		System.out.println("Product with this pointer="+a*b);
	}
}