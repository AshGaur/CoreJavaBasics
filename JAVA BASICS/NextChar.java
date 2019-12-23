import java.util.Scanner;
class NextChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a = sc.next().charAt(0);
		System.out.println("Entered character="+a);
		a++;
		System.out.println("Next character="+a);
	}
}
		