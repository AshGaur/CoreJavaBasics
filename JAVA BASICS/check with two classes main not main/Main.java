import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt(),b=sc.nextInt();
		Area m=new Area();
		System.out.println("Default value of non static member or instance variable="+m.length);//Default value of instance variable =0
		m.getArea(l,b);
		System.out.println("Default value of static variable="+m.a); //Default value of static variable=0
	}
}